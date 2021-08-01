package com.cu.test.ocpp.handler;

import com.cu.test.ocpp.data.*;
import com.cu.test.ocpp.exception.OcppException;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.google.common.base.Strings;
import eu.chargetime.ocpp.model.Confirmation;
import eu.chargetime.ocpp.model.Request;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import static com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN;
import static com.fasterxml.jackson.databind.DeserializationFeature.*;

@Slf4j
public abstract class AbstractOcppHandler {

    public abstract OcppVersion getVersion();
    protected abstract String getBaseRequestPackage(String action);
    protected abstract Confirmation dispatch(String chargingStationId, Request request);

    public String handleTextMessage(String chargingStationId, String incomingString){
        JSONArray incomingJson = new JSONArray(incomingString);
        MessageType messageType = MessageType.fromTypeNumber(incomingJson.getInt(0));
        String messageId = incomingJson.optString(1);
        Request reqObj = null;

        ObjectMapper inputMapper = new ObjectMapper();
        inputMapper.configure(FAIL_ON_UNKNOWN_PROPERTIES, false);
        inputMapper.enable(ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
        inputMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        inputMapper.registerModule(new SimpleModule().addDeserializer(ZonedDateTime.class, new JsonDeserializer<ZonedDateTime>() {
            @Override
            public ZonedDateTime deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
                return ZonedDateTime.parse(jsonParser.getText(), DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'").withZone(ZoneId.systemDefault()));
            }
        }));
        inputMapper.registerModule(new JavaTimeModule());


        ObjectMapper outputMapper = new ObjectMapper();
        outputMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        outputMapper.registerModule(new SimpleModule().addSerializer(ZonedDateTime.class, new JsonSerializer<ZonedDateTime>() {

            @Override
            public void serialize(ZonedDateTime value, JsonGenerator gen, SerializerProvider serializers)
                    throws IOException {
                gen.writeString(value.format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")));
            }

        }));
        outputMapper.configure(FAIL_ON_UNKNOWN_PROPERTIES, false);
        outputMapper.enable(ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
        outputMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);

        outputMapper.configure(FAIL_ON_NULL_FOR_PRIMITIVES, true);
        outputMapper.configure(WRITE_BIGDECIMAL_AS_PLAIN, true);

        try {
            switch (messageType) {
                case CALL:

                    String action = incomingJson.optString(2);
                    if (Strings.isNullOrEmpty(action)) {
                        throw new OcppException(ErrorFactory.actionNotFound(messageId, action));
                    }

                    JSONObject payload = incomingJson.optJSONObject(3);


                    String baseRequestPackage = getBaseRequestPackage(action);
                    log.debug("baseRequestPackage [" + baseRequestPackage + "]");
                    Class<? extends Request> clazz = null;
                    try {
                        clazz = (Class<? extends Request>) Class.forName(baseRequestPackage);
                        if (clazz == null) {
                            throw new OcppException(ErrorFactory.actionNotFound(messageId, action));
                        }
                    } catch (Exception e) {
                        log.error("action to class error", e);
                        throw new OcppException(ErrorFactory.actionNotFound(messageId, action));
                    }

                    try {
                        reqObj = inputMapper.readValue(payload.toString(), clazz);
                    } catch (Exception e) {
                        log.error("action parsing ", e);
                        throw new OcppException(ErrorFactory.genericDeserializeError(messageId, "action parsing error"));
                    }

                    break;
            }
        }catch(OcppException e){
            log.error("Ocpp exception {}", e.getMessage());
            return e.getMessage();
        }

        try{
            Confirmation response = dispatch(chargingStationId, reqObj);

            String resPayload = outputMapper.writeValueAsString(response);
            log.debug("resPayload["+resPayload+"]");
            JSONObject resPayloadJson = new JSONObject(resPayload);

            MessageFactory.callResultMessage(messageId, resPayloadJson.toString());
            return MessageFactory.callResultMessage(messageId, resPayloadJson.toString());

        } catch (Exception e) {
            log.error("Exception occurred", e);
            return MessageFactory.callErrorMessage(messageId, ErrorCode.GenericError, "runtime error : "+e.getMessage(), "your input : "+incomingJson.optJSONObject(3).toString());
        }
    }
}
