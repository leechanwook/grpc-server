package eu.chargetime.ocpp.model.basic.types;

public class OCSPRequestDataType {
    private HashAlgorithmEnumType hashAlgorithm;
    private String issuerNameHash;
    private String issuerKeyHash;
    private String serialNumber;
    private String responderURL;

    public OCSPRequestDataType() {
    }

    public HashAlgorithmEnumType getHashAlgorithm() {
        return this.hashAlgorithm;
    }

    public void setHashAlgorithm(HashAlgorithmEnumType hashAlgorithm) {
        this.hashAlgorithm = hashAlgorithm;
    }

    public String getIssuerNameHash() {
        return this.issuerNameHash;
    }

    public void setIssuerNameHash(String issuerNameHash) {
        this.issuerNameHash = issuerNameHash;
    }

    public String getIssuerKeyHash() {
        return this.issuerKeyHash;
    }

    public void setIssuerKeyHash(String issuerKeyHash) {
        this.issuerKeyHash = issuerKeyHash;
    }

    public String getSerialNumber() {
        return this.serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getResponderURL() {
        return this.responderURL;
    }

    public void setResponderURL(String responderURL) {
        this.responderURL = responderURL;
    }
}
