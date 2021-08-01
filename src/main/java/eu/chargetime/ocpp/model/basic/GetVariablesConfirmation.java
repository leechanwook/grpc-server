package eu.chargetime.ocpp.model.basic;

import eu.chargetime.ocpp.model.Confirmation;
import eu.chargetime.ocpp.model.basic.types.GetVariableResultType;
import eu.chargetime.ocpp.utilities.MoreObjects;

import java.util.Arrays;
import java.util.Objects;

public class GetVariablesConfirmation implements Confirmation {
    private GetVariableResultType[] getVariableResult;

    public GetVariablesConfirmation() {
    }

    public GetVariableResultType[] getGetVariableResult() {
        return this.getVariableResult;
    }

    public void setGetVariableResult(GetVariableResultType[] getVariableResult) {
        this.getVariableResult = getVariableResult;
    }

    public boolean validate() {
        return this.getVariableResult != null && this.getVariableResult.length > 0 && Arrays.stream(this.getVariableResult).allMatch((getVariableResult) -> {
            return getVariableResult.validate();
        });
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            GetVariablesConfirmation that = (GetVariablesConfirmation)o;
            return Arrays.equals(this.getVariableResult, that.getVariableResult);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.getVariableResult});
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("getVariableResult", this.getVariableResult).toString();
    }
}
