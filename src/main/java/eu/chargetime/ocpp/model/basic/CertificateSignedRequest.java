package eu.chargetime.ocpp.model.basic;

import eu.chargetime.ocpp.model.Request;
import eu.chargetime.ocpp.model.basic.types.CertificateSigningUseEnumType;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CertificateSignedRequest implements Request {

    String certificateChain;
    CertificateSigningUseEnumType certificateType;

    @Override
    public boolean transactionRelated() {
        return false;
    }

    @Override
    public boolean validate() {
        return true;
    }
}
