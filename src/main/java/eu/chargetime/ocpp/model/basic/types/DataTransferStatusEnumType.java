package eu.chargetime.ocpp.model.basic.types;

public enum DataTransferStatusEnumType {
    Accepted,
    Rejected,
    UnknownMessageId,
    UnknownVendorId;

    private DataTransferStatusEnumType() {
    }
}
