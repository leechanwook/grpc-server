package eu.chargetime.ocpp.model.basic.types;

public enum SignatureMethodEnumType {
    ECDSAP256SHA256,
    ECDSAP384SHA384,
    ECDSA192SHA256;

    private SignatureMethodEnumType() {
    }
}
