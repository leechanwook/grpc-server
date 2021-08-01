package eu.chargetime.ocpp.model.basic;

import eu.chargetime.ocpp.model.Request;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UnlockConnectorRequest  implements Request {

    Integer evseId;
    Integer connectorId;

    @Override
    public boolean transactionRelated() {
        return false;
    }

    @Override
    public boolean validate() {
        return true;
    }
}
