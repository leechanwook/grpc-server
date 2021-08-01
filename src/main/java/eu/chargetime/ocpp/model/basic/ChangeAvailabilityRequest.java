package eu.chargetime.ocpp.model.basic;

import eu.chargetime.ocpp.model.Request;
import eu.chargetime.ocpp.model.basic.types.EVSEType;
import eu.chargetime.ocpp.model.basic.types.OperationalStatusEnumType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChangeAvailabilityRequest implements Request {

    EVSEType evse;
    OperationalStatusEnumType operationalStatus;

    @Override
    public boolean transactionRelated() {
        return false;
    }

    @Override
    public boolean validate() {
        return true;
    }
}
