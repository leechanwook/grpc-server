package eu.chargetime.ocpp.model.basic.types;

public enum ChargePointStatusEnumType {
    Available,
    Preparing,
    Charging,
    SuspendedEVSE,
    SuspendedEV,
    Finishing,
    Reserved,
    Unavailable,
    Faulted;

    private ChargePointStatusEnumType() {
    }
}
