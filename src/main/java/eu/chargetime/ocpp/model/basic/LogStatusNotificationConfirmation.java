package eu.chargetime.ocpp.model.basic;

import eu.chargetime.ocpp.model.Confirmation;

public class LogStatusNotificationConfirmation implements Confirmation {
    public LogStatusNotificationConfirmation() {
    }

    public boolean validate() {
        return true;
    }
}
