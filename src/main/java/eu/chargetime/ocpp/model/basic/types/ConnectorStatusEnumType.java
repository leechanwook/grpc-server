package eu.chargetime.ocpp.model.basic.types;

public enum ConnectorStatusEnumType {
    Available,
    Occupied,
    Reserved,
    Unavailable,
    Faulted;

    private ConnectorStatusEnumType() {
    }
}
