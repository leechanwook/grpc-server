package eu.chargetime.ocpp.model.basic;

import eu.chargetime.ocpp.model.Confirmation;
import eu.chargetime.ocpp.model.basic.types.ChangeAvailabilityStatusEnumType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChangeAvailabilityConfirmation implements Confirmation {

    ChangeAvailabilityStatusEnumType status;

    @Override
    public boolean validate() {
        return true;
    }
}
