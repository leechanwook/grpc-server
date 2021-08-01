package eu.chargetime.ocpp.model.basic;

import eu.chargetime.ocpp.model.Request;
import eu.chargetime.ocpp.model.basic.types.CertificateSigningUseEnumType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignCertificateRequest  implements Request {
    String csr;
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
