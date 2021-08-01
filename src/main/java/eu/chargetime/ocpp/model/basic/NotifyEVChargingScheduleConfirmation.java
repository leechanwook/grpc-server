package eu.chargetime.ocpp.model.basic;

import eu.chargetime.ocpp.model.Confirmation;
import eu.chargetime.ocpp.model.basic.types.GenericStatusEnumType;

public class NotifyEVChargingScheduleConfirmation implements Confirmation {
    private GenericStatusEnumType status;

    public NotifyEVChargingScheduleConfirmation() {
    }

    public GenericStatusEnumType getStatus() {
        return this.status;
    }

    public void setStatus(GenericStatusEnumType status) {
        this.status = status;
    }

    public boolean validate() {
        return true;
    }
}
