package eu.chargetime.ocpp.model.basic;

import eu.chargetime.ocpp.model.Confirmation;
import eu.chargetime.ocpp.model.basic.types.CertificateStatusEnumType;
import eu.chargetime.ocpp.model.basic.types.IdTokenInfoType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuthorizeConfirmation implements Confirmation {

    private CertificateStatusEnumType certificateStatus;
    //private List<Integer> evseId;
    private IdTokenInfoType idTokenInfo;

    @Override
    public boolean validate() {
        return false;
    }
}
