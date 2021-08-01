package eu.chargetime.ocpp.model.basic;

import eu.chargetime.ocpp.model.Confirmation;
import eu.chargetime.ocpp.model.basic.types.RequestStartStopStatusEnumType;
import eu.chargetime.ocpp.model.basic.types.StatusInfoType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequestStartTransactionConfirmation implements Confirmation {

    private RequestStartStopStatusEnumType status;
    String transactionId;
    StatusInfoType statusInfoType;

    @Override
    public boolean validate() {
        return true;
    }
}
