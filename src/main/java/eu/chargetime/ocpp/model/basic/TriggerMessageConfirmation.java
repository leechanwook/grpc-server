package eu.chargetime.ocpp.model.basic;

import eu.chargetime.ocpp.model.Confirmation;
import eu.chargetime.ocpp.model.basic.types.StatusInfoType;
import eu.chargetime.ocpp.model.basic.types.TriggerMessageStatusEnumType;

public class TriggerMessageConfirmation implements Confirmation {
    TriggerMessageStatusEnumType status;
    StatusInfoType statusInfo;

    @Override
    public boolean validate() {
        return true;
    }
}
