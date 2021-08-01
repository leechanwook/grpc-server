

package eu.chargetime.ocpp.model.basic;

import eu.chargetime.ocpp.model.Request;
import eu.chargetime.ocpp.model.basic.types.InstallCertificateUseEnumType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InstallCertificateRequest implements Request {
    private InstallCertificateUseEnumType certificateType;
    private String certificate;

    //private List<Integer> evseId;


    @Override
    public boolean transactionRelated() {
        return false;
    }

    @Override
    public boolean validate() {
        return true;
    }
}
