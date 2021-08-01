package eu.chargetime.ocpp.model.basic;


import eu.chargetime.ocpp.model.Request;
import eu.chargetime.ocpp.model.basic.types.ResetEnumType;
import eu.chargetime.ocpp.model.core.ResetType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResetRequest implements Request {

    private ResetEnumType type;
    int evseId;

    @Override
    public boolean transactionRelated() {
        return false;
    }

    @Override
    public boolean validate() {
        return true;
    }
}
