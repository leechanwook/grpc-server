package eu.chargetime.ocpp.model.basic.types;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ReportDataType {
    ComponentType component;
    VariableType variable;
    List<VariableAttributeType> variableAttribute;
    VariableCharacteristicsType variableCharacteristics;
}
