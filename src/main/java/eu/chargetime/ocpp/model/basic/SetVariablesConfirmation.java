package eu.chargetime.ocpp.model.basic;

import eu.chargetime.ocpp.model.Confirmation;
import eu.chargetime.ocpp.model.basic.types.SetVariableResultType;
import eu.chargetime.ocpp.model.validation.RequiredValidator;
import eu.chargetime.ocpp.model.validation.Validator;
import eu.chargetime.ocpp.utilities.MoreObjects;

import java.util.Arrays;
import java.util.Objects;

public class SetVariablesConfirmation implements Confirmation {
    private transient Validator<Object> requiredValidator = new RequiredValidator();
    private SetVariableResultType[] setVariableResult;

    public SetVariablesConfirmation() {
    }

    public SetVariableResultType[] getSetVariableResult() {
        return this.setVariableResult;
    }

    public void setSetVariableResult(SetVariableResultType[] setVariableResult) {
        this.requiredValidator.validate(setVariableResult);
        this.setVariableResult = setVariableResult;
    }

    public boolean validate() {
        return this.setVariableResult != null && this.setVariableResult.length > 0 && Arrays.stream(this.setVariableResult).allMatch((setVariableResult) -> {
            return setVariableResult.validate();
        });
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            SetVariablesConfirmation that = (SetVariablesConfirmation)o;
            return Arrays.equals(this.setVariableResult, that.setVariableResult);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.setVariableResult});
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("setVariableResult", this.setVariableResult).toString();
    }
}
