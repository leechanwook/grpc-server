package eu.chargetime.ocpp.model.basic.types;

public enum MonitorEnumType {
    UpperThreshold,
    LowerThreshold,
    Delta,
    Periodic,
    PeriodicClockAligned;

    private MonitorEnumType(){
    }
}
