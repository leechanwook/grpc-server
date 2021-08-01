package eu.chargetime.ocpp.model.basic.types;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CertificateHashDataType {
    HashAlgorithmEnumType hashAlgorithm;
    String issuerNameHash;
    String issuerKeyHash;
    String serialNumber;
}
