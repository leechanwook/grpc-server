package eu.chargetime.ocpp.model.basic;

import eu.chargetime.ocpp.model.Confirmation;

public class NotifyReportConfirmation implements Confirmation {
    @Override
    public boolean validate() {
        return true;
    }
}
