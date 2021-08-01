package eu.chargetime.ocpp.model.basic;

import eu.chargetime.ocpp.model.Request;
import eu.chargetime.ocpp.model.basic.types.ComponentVariableType;
import eu.chargetime.ocpp.model.basic.types.MonitoringCriterionEnumType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetMonitoringReportRequest implements Request {


    Integer requestId;
    MonitoringCriterionEnumType monitoringCriteria;
    ComponentVariableType componentVariable;
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
