package eu.chargetime.ocpp.model.basic;

import eu.chargetime.ocpp.model.Confirmation;
import eu.chargetime.ocpp.model.basic.types.InstallCertificateStatusEnumType;
import eu.chargetime.ocpp.model.basic.types.StatusInfoType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InstallCertificateConfirmation implements Confirmation {

    InstallCertificateStatusEnumType status;
    private StatusInfoType statusInfo;

    @Override
    public boolean validate() {
        return false;
    }
}
