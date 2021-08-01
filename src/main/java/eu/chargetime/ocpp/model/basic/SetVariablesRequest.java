package eu.chargetime.ocpp.model.basic;

import eu.chargetime.ocpp.model.Request;
import eu.chargetime.ocpp.model.basic.types.SetVariableDataType;
import eu.chargetime.ocpp.model.validation.RequiredValidator;
import eu.chargetime.ocpp.model.validation.Validator;
import eu.chargetime.ocpp.utilities.MoreObjects;

import java.util.Arrays;
import java.util.Objects;

public class SetVariablesRequest implements Request {
    private transient Validator<Object> requiredValidator = new RequiredValidator();
    private SetVariableDataType[] setVariableData;

    public SetVariablesRequest() {
    }

    public boolean transactionRelated() {
        return false;
    }

    public boolean validate() {
        return this.setVariableData != null && this.setVariableData.length > 0 && Arrays.stream(this.setVariableData).allMatch((setVariableDataType) -> {
            return setVariableDataType.validate();
        });
    }

    public void setSetVariableData(SetVariableDataType[] setVariableData) {
        this.requiredValidator.validate(setVariableData);
        this.setVariableData = setVariableData;
    }

    public SetVariableDataType[] getSetVariableData() {
        return this.setVariableData;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            SetVariablesRequest that = (SetVariablesRequest)o;
            return Arrays.equals(this.setVariableData, that.setVariableData);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.setVariableData});
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("setVariableData", this.setVariableData).toString();
    }
}
