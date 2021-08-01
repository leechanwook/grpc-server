package eu.chargetime.ocpp.model.basic;

import eu.chargetime.ocpp.model.Confirmation;
import eu.chargetime.ocpp.model.basic.types.ChargingProfileStatusEnumType;
import eu.chargetime.ocpp.model.basic.types.StatusInfoType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SetChargingProfileConfirmation implements Confirmation {

    ChargingProfileStatusEnumType status;
    StatusInfoType statusInfo;

    @Override
    public boolean validate() {
        return false;
    }
}
