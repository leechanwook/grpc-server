package eu.chargetime.ocpp.model.basic.types;

public enum SetVariableStatusEnumType {
    Accepted,
    Rejected,
    InvalidValue,
    UnknownComponent,
    UnknownVariable,
    NotSupportedAttributeType,
    OutOfRange,
    RebootRequired;

    private SetVariableStatusEnumType() {
    }
}
