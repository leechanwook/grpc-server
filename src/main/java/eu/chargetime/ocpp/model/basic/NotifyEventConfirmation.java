package eu.chargetime.ocpp.model.basic;

import eu.chargetime.ocpp.model.Confirmation;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class NotifyEventConfirmation implements Confirmation {

    @Override
    public boolean validate() {
        return true;
    }
}
