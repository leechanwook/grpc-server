package com.cu.test.service;

import com.cu.server.csms.ocpp.grpc.service.*;
import com.cu.test.ocpp.data.ErrorFactory;
import com.cu.test.ocpp.data.MessageType;
import com.cu.test.ocpp.data.OcppVersion;
import com.cu.test.ocpp.handler.AbstractOcppHandler;
import com.cu.test.ocpp.handler.Ocpp16Handler;
import com.cu.test.ocpp.handler.Ocpp201Handler;
import com.google.common.base.Strings;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

@Slf4j
@Service
public class OcppService extends OcppServiceGrpc.OcppServiceImplBase {

    private final Map<String, AbstractOcppHandler> protocolHandlerLookup = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

    @Autowired Ocpp201Handler ocpp201Handler;
    @Autowired Ocpp16Handler ocpp16Handler;


    @PostConstruct
    public void setHandler(){
        log.debug("ocpp support list");
        log.debug("["+OcppVersion.V_16.getValue()+"]ocpp16Handler["+ocpp16Handler+"]");
        log.debug("["+OcppVersion.V_201.getValue()+"]ocpp201Handler["+ocpp201Handler+"]");
        protocolHandlerLookup.put(OcppVersion.V_16.getValue(), ocpp16Handler);
        protocolHandlerLookup.put(OcppVersion.V_201.getValue(), ocpp201Handler);
    }

    @Override
    public void sendMessage(OcppRequest request, StreamObserver<OcppResponse> responseObserver) {
        String chargingStationId = request.getChargingStationId();
        String requestMessage = request.getMessage();
        String ocppVersion = request.getOcppVersion();
        log.info("Core -> Service : ocppVersion["+ocppVersion+"]["+chargingStationId+"]message["+requestMessage+"]");

        Set<String> keys = protocolHandlerLookup.keySet();

        keys.stream().forEach(key -> log.debug("key["+key+"]value["+protocolHandlerLookup.get(key)+"]"));

        AbstractOcppHandler handler = protocolHandlerLookup.get(ocppVersion);
        log.debug("version["+handler.getVersion().getValue()+"]");
        String responseMessage = handler.handleTextMessage(chargingStationId, requestMessage);

        log.info("Service -> Core : chargingStationId["+chargingStationId+"]message["+responseMessage+"]");
        OcppResponse response = OcppResponse.newBuilder()
                .setChargingStationId(chargingStationId)
                .setMessage(responseMessage)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getChargingStationItem(ChargingStationRequest request, StreamObserver<ChargingStationResponse> responseObserver) {


//        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
