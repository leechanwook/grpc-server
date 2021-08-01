

package eu.chargetime.ocpp.model.basic;

import eu.chargetime.ocpp.model.Request;
import eu.chargetime.ocpp.model.basic.types.CertificateHashDataType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DeleteCertificateRequest implements Request {
    CertificateHashDataType certificateHashData;

    @Override
    public boolean transactionRelated() {
        return false;
    }

    @Override
    public boolean validate() {
        return true;
    }
}
