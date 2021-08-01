

package eu.chargetime.ocpp.model.basic;

import eu.chargetime.ocpp.model.Request;
import eu.chargetime.ocpp.model.basic.types.ChargingProfileType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SetChargingProfileRequest implements Request {
    Integer evseId;
    ChargingProfileType chargingProfile;


    @Override
    public boolean transactionRelated() {
        return false;
    }

    @Override
    public boolean validate() {
        return true;
    }
}
