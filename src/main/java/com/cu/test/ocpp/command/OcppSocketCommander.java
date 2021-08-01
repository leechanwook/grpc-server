package com.cu.test.ocpp.command;

import com.cu.test.grpc.client.OcppSocketService;
import com.cu.test.ocpp.data.ErrorCode;
import com.cu.test.ocpp.data.MessageFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import eu.chargetime.ocpp.model.Confirmation;
import eu.chargetime.ocpp.model.Request;
import eu.chargetime.ocpp.model.basic.ResetRequest;
import eu.chargetime.ocpp.model.basic.types.ResetEnumType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
public class OcppSocketCommander {

    @Autowired
    OcppSocketService ocppSocketService;

    public void run(String chargingStationId, Request request) {
        String messageId = UUID.randomUUID().toString();
        String name = request.getClass().getSimpleName();
        String actionName = replaceLast("Request", "", name);
        log.debug("actionName["+actionName+"]");

        String sendMessage = "";
        try {
            String payload = new ObjectMapper().writeValueAsString(request);
            sendMessage = MessageFactory.callMessage(messageId, actionName, payload);
        }catch(Exception e){
            log.error("request to payload convert fail", e);
            sendMessage = MessageFactory.callErrorMessage(messageId, ErrorCode.GenericError, "request to payload convert fail : "+e.getMessage(),null);
        }
        ocppSocketService.sendMessage(chargingStationId, sendMessage);
    }

    private static String replaceLast(String find, String replace, String string) {
        int lastIndex = string.lastIndexOf(find);

        if (lastIndex == -1) {
            return string;
        }

        String beginString = string.substring(0, lastIndex);
        String endString = string.substring(lastIndex + find.length());

        return beginString + replace + endString;
    }

}
