package eu.chargetime.ocpp.model.basic;

import eu.chargetime.ocpp.model.Request;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequestStopTransactionRequest implements Request {

    String transactionId;

    @Override
    public boolean transactionRelated() {
        return false;
    }

    @Override
    public boolean validate() {
        return true;
    }
}
