package eu.chargetime.ocpp.model.basic;

import eu.chargetime.ocpp.model.Request;
import eu.chargetime.ocpp.model.basic.types.GetVariableDataType;
import eu.chargetime.ocpp.utilities.MoreObjects;

import java.util.Arrays;
import java.util.Objects;

public class GetVariablesRequest implements Request {
    private GetVariableDataType[] getVariableData;

    public GetVariablesRequest() {
    }

    public GetVariableDataType[] getGetVariableData() {
        return this.getVariableData;
    }

    public void setGetVariableData(GetVariableDataType[] getVariableData) {
        this.getVariableData = getVariableData;
    }

    public boolean transactionRelated() {
        return false;
    }

    public boolean validate() {
        return this.getVariableData != null && this.getVariableData.length > 0 && Arrays.stream(this.getVariableData).allMatch((getVariableData) -> {
            return getVariableData.validate();
        });
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            GetVariablesRequest that = (GetVariablesRequest)o;
            return Arrays.equals(this.getVariableData, that.getVariableData);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.getVariableData});
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("getVariableData", this.getVariableData).toString();
    }
}
