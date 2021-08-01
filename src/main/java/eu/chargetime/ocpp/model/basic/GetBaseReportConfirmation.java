package eu.chargetime.ocpp.model.basic;

import eu.chargetime.ocpp.model.Confirmation;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetBaseReportConfirmation implements Confirmation {
    @Override
    public boolean validate() {
        return true;
    }
}
