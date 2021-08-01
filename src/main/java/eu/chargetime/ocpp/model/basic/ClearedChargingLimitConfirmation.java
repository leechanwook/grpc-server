package eu.chargetime.ocpp.model.basic;

import eu.chargetime.ocpp.model.Confirmation;

public class ClearedChargingLimitConfirmation implements Confirmation {
    public ClearedChargingLimitConfirmation() {
    }

    public boolean validate() {
        return true;
    }
}
