package eu.chargetime.ocpp.model.basic.types;

public enum BootReasonEnumType {
    ApplicationReset,
    FirmwareUpdate,
    LocalReset,
    PowerUp,
    RemoteReset,
    ScheduledReset,
    Triggered,
    Unknown,
    Watchdog;

    private BootReasonEnumType() {
    }
}
