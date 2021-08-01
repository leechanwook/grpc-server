package eu.chargetime.ocpp.model.basic.types;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VariableAttributeType {
    AttributeEnumType type;
    String value;
    MutabilityEnumType mutability;
    Boolean persistence;
    Boolean constant;
}
