package eu.chargetime.ocpp.model.basic;

import eu.chargetime.ocpp.model.Confirmation;
import eu.chargetime.ocpp.model.basic.types.DeleteCertificateStatusEnumType;
import eu.chargetime.ocpp.model.basic.types.StatusInfoType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DeleteCertificateConfirmation implements Confirmation {

    DeleteCertificateStatusEnumType status;
    private StatusInfoType statusInfo;

    @Override
    public boolean validate() {
        return false;
    }
}
