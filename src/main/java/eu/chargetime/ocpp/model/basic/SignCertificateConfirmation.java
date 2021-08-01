package eu.chargetime.ocpp.model.basic;

import eu.chargetime.ocpp.model.Confirmation;
import eu.chargetime.ocpp.model.basic.types.GenericStatusEnumType;
import eu.chargetime.ocpp.model.basic.types.StatusInfoType;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SignCertificateConfirmation implements Confirmation {
    GenericStatusEnumType status;
    StatusInfoType statusInfo;

    @Override
    public boolean validate() {
        return true;
    }
}
