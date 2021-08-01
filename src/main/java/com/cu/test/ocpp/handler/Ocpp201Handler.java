package com.cu.test.ocpp.handler;

import com.cu.test.ocpp.data.OcppVersion;
import com.cu.test.ocpp.service.Ocpp201Service;
import eu.chargetime.ocpp.model.Confirmation;
import eu.chargetime.ocpp.model.Request;
import eu.chargetime.ocpp.model.basic.BootNotificationRequest;
import eu.chargetime.ocpp.model.basic.StatusNotificationRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Slf4j
@Component
public class Ocpp201Handler extends AbstractOcppHandler{

    @Autowired
    Ocpp201Service ocpp201Service;

    @Override
    public OcppVersion getVersion() {
        return OcppVersion.V_201;
    }

    @Override
    protected String getBaseRequestPackage(String action) {
        return "eu.chargetime.ocpp.model.basic." + action + "Request";
    }

    @Override
    protected Confirmation dispatch(String chargingStationId, Request request) {
        log.debug("request["+request+"]");
        Confirmation confirmation = null;
        if(request instanceof BootNotificationRequest) {
            confirmation = ocpp201Service.bootNotificationWithTransport(chargingStationId, (BootNotificationRequest) request);
        }else if(request instanceof StatusNotificationRequest){
            confirmation = ocpp201Service.statusNotification(chargingStationId, (StatusNotificationRequest)request);

        } else {
            throw new IllegalArgumentException("Unexpected RequestType, dispatch method not found");
        }
        return confirmation;
    }
}
