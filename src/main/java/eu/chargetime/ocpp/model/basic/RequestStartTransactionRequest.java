package eu.chargetime.ocpp.model.basic;

import eu.chargetime.ocpp.model.Request;
import eu.chargetime.ocpp.model.basic.types.ChargingProfileType;
import eu.chargetime.ocpp.model.basic.types.IdTokenType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequestStartTransactionRequest  implements Request {

    Integer evseId;
    Integer remoteStartId;
    IdTokenType idToken;
    ChargingProfileType chargingProfile;
    IdTokenType groupIdToken;

    @Override
    public boolean transactionRelated() {
        return false;
    }

    @Override
    public boolean validate() {
        return true;
    }
}
