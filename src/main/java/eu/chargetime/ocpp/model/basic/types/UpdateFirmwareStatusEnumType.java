package eu.chargetime.ocpp.model.basic.types;

public enum UpdateFirmwareStatusEnumType {
    Accepted,
    Rejected,
    AcceptedCanceled,
    InvalidCertificate,
    RevokedCertificate;
    private UpdateFirmwareStatusEnumType(){}
}
