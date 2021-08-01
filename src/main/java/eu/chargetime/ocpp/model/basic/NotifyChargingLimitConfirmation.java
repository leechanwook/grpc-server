package eu.chargetime.ocpp.model.basic;

import eu.chargetime.ocpp.model.Confirmation;

public class NotifyChargingLimitConfirmation implements Confirmation {
    public NotifyChargingLimitConfirmation() {
    }

    public boolean validate() {
        return true;
    }
}
