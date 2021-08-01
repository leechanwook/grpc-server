package eu.chargetime.ocpp.model.basic.types;

public enum UnlockStatusEnumType {
    Unlocked,
    UnlockFailed,
    OngoingAuthorizedTransaction,
    UnknownConnector;
    private UnlockStatusEnumType(){}
}
