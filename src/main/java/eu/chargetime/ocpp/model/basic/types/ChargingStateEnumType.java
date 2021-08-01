package eu.chargetime.ocpp.model.basic.types;

public enum ChargingStateEnumType {
    Charging,
    EVConnected,
    SuspendedEV,
    SuspendedEVSE;

    private ChargingStateEnumType() {
    }
}
