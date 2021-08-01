package eu.chargetime.ocpp.model.basic;

import eu.chargetime.ocpp.model.Request;
import eu.chargetime.ocpp.model.basic.types.LogEnumType;
import eu.chargetime.ocpp.model.basic.types.LogParametersType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetLogRequest implements Request {

    LogEnumType logType;
    Integer requestId;
    Integer retries;
    Integer retryInterval;
    LogParametersType log;

    @Override
    public boolean transactionRelated() {
        return false;
    }

    @Override
    public boolean validate() {
        return true;
    }
    //return this.validator.safeValidate(this.reason) && this.validator.safeValidate(this.chargingStation) && this.chargingStation.validate();
}
