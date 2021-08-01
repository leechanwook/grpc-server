

package eu.chargetime.ocpp.model.basic;

import eu.chargetime.ocpp.model.Request;
import eu.chargetime.ocpp.model.basic.types.IdTokenType;
import eu.chargetime.ocpp.model.basic.types.OCSPRequestDataType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuthorizeRequest implements Request {
    private IdTokenType idToken;
    private String certificate;
    private OCSPRequestDataType iso15118CertificateHashData;
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
