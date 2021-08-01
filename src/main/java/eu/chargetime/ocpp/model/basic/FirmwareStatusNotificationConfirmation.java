package eu.chargetime.ocpp.model.basic;

import eu.chargetime.ocpp.model.Confirmation;

public class FirmwareStatusNotificationConfirmation implements Confirmation {
    public FirmwareStatusNotificationConfirmation() {
    }

    public boolean validate() {
        return true;
    }
}
