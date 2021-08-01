package com.cu.test.ocpp.handler;

import com.cu.test.ocpp.data.OcppVersion;
import eu.chargetime.ocpp.model.Confirmation;
import eu.chargetime.ocpp.model.Request;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class Ocpp16Handler extends AbstractOcppHandler{
    @Override
    public OcppVersion getVersion() {
        return null;
    }

    @Override
    protected String getBaseRequestPackage(String action) {
        return null;
    }

    @Override
    protected Confirmation dispatch(String chargingStationId, Request request) {
        return null;
    }
}
