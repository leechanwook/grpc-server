

package eu.chargetime.ocpp.model.basic;

import eu.chargetime.ocpp.model.Request;
import eu.chargetime.ocpp.model.basic.types.EVSEType;
import eu.chargetime.ocpp.model.basic.types.MessageTriggerEnumType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TriggerMessageRequest implements Request {
    MessageTriggerEnumType requestedMessage;
    EVSEType evse;

    @Override
    public boolean transactionRelated() {
        return false;
    }

    @Override
    public boolean validate() {
        return true;
    }
}
