package eu.chargetime.ocpp.model.basic.types;

public enum FirmwareStatusEnumType {
    CertificateVerified,
    Downloaded,
    DownloadFailed,
    Downloading,
    DownloadScheduled,
    DownloadPaused,
    Idle,
    InstallationFailed,
    Installing,
    Installed,
    InstallRebooting,
    InstallScheduled,
    InstallVerificationFailed,
    InvalidSignature,
    InvalidCertificate,
    RevokedCertificate,
    PublishFailed,
    SignatureVerified;

    private FirmwareStatusEnumType() {
    }
}
