package com.cu.test.ocpp.command;

import eu.chargetime.ocpp.model.basic.RequestStartTransactionRequest;
import eu.chargetime.ocpp.model.basic.ResetRequest;
import eu.chargetime.ocpp.model.basic.types.IdTokenEnumType;
import eu.chargetime.ocpp.model.basic.types.IdTokenType;
import eu.chargetime.ocpp.model.basic.types.ResetEnumType;
import org.springframework.stereotype.Service;

@Service
public class Ocpp201SocketCommander extends OcppSocketCommander{

    public void reset(String chargingStationId, int evseId){
        ResetRequest reset = new ResetRequest();
        reset.setType(ResetEnumType.Immediate);
        reset.setEvseId(evseId);
        this.run(chargingStationId, reset);
    }

    public void requestStartTransactionRequest(String chargingStationId, int remoteStartId, int evseId, IdTokenType idTokenType){
        RequestStartTransactionRequest rstr = new RequestStartTransactionRequest();
        rstr.setRemoteStartId(remoteStartId);
        rstr.setEvseId(evseId);
        rstr.setIdToken(idTokenType);
        this.run(chargingStationId, rstr);
    }
}
