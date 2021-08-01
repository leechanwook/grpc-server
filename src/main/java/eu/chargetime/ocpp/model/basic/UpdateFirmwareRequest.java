package eu.chargetime.ocpp.model.basic;

import eu.chargetime.ocpp.model.Request;
import eu.chargetime.ocpp.model.basic.types.FirmwareType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateFirmwareRequest  implements Request {
    Integer retries;
    Integer retryInterval;
    Integer requestId;
    FirmwareType firmware;


    @Override
    public boolean transactionRelated() {
        return false;
    }

    @Override
    public boolean validate() {
        return true;
    }
}
