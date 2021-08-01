package eu.chargetime.ocpp.model.basic;

import eu.chargetime.ocpp.model.Confirmation;
import eu.chargetime.ocpp.model.core.ResetStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResetConfirmation implements Confirmation {

    private ResetStatus status;

    @Override
    public boolean validate() {
        return true;
    }
}
