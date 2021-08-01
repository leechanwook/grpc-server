package eu.chargetime.ocpp.model.basic;

import eu.chargetime.ocpp.model.Confirmation;
import eu.chargetime.ocpp.model.basic.types.CertificateSigningUseEnumType;
import eu.chargetime.ocpp.model.basic.types.StatusInfoType;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CertificateSignedConfirmation implements Confirmation {

    CertificateSigningUseEnumType status;
    StatusInfoType statusInfo;

    @Override
    public boolean validate() {
        return true;
    }
}
