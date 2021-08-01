package eu.chargetime.ocpp.model.basic.types;

public enum UploadLogStatusEnumType {
    BadMessage,
    Idle,
    NotSupportedOperation,
    PermissionDenied,
    Uploaded,
    UploadFailure,
    Uploading;

    private UploadLogStatusEnumType() {
    }
}
