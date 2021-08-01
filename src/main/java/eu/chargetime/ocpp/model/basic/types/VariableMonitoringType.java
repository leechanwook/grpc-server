package eu.chargetime.ocpp.model.basic.types;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class VariableMonitoringType {
    Integer id;
    Double value;
    MonitorEnumType type;
    Integer severity;
    Boolean transaction;
}
