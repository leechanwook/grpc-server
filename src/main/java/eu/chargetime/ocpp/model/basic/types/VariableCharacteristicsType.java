package eu.chargetime.ocpp.model.basic.types;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VariableCharacteristicsType {
    String unit;
    DataEnumType dataType;
    Double minLimit;
    Double maxLimit;
    String valuesList;
    Boolean supportsMonitoring;
}
