package eu.chargetime.ocpp.model.basic;

import eu.chargetime.ocpp.model.Confirmation;
import eu.chargetime.ocpp.model.basic.types.LogStatusEnumType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetLogConfirmation implements Confirmation {
    LogStatusEnumType status;
    String filename;

    @Override
    public boolean validate() {
        return true;
    }
}
