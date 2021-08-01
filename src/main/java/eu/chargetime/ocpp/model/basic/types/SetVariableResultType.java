//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package eu.chargetime.ocpp.model.basic.types;

import eu.chargetime.ocpp.model.Validatable;
import eu.chargetime.ocpp.model.validation.RequiredValidator;
import eu.chargetime.ocpp.model.validation.Validator;
import eu.chargetime.ocpp.utilities.MoreObjects;

import java.util.Objects;

public class SetVariableResultType implements Validatable {
    private transient Validator<Object> requiredValidator = new RequiredValidator();
    private AttributeEnumType attributeType;
    private SetVariableStatusEnumType attributeStatus;
    private ComponentType component;
    private VariableType variable;

    public SetVariableResultType() {
    }

    public AttributeEnumType getAttributeType() {
        return this.attributeType;
    }

    public void setAttributeType(AttributeEnumType attributeType) {
        this.attributeType = attributeType;
    }

    public SetVariableStatusEnumType getAttributeStatus() {
        return this.attributeStatus;
    }

    public void setAttributeStatus(SetVariableStatusEnumType attributeStatus) {
        this.requiredValidator.validate(attributeStatus);
        this.attributeStatus = attributeStatus;
    }

    public ComponentType getComponent() {
        return this.component;
    }

    public void setComponent(ComponentType component) {
        this.requiredValidator.validate(component);
        this.component = component;
    }

    public VariableType getVariable() {
        return this.variable;
    }

    public void setVariable(VariableType variable) {
        this.requiredValidator.validate(variable);
        this.variable = variable;
    }

    public boolean validate() {
        return this.requiredValidator.safeValidate(this.attributeStatus) && this.requiredValidator.safeValidate(this.component) && this.requiredValidator.safeValidate(this.variable) && this.component.validate() && this.variable.validate();
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            SetVariableResultType that = (SetVariableResultType)o;
            return Objects.equals(this.attributeType, that.attributeType) && Objects.equals(this.attributeStatus, that.attributeStatus) && Objects.equals(this.component, that.component) && Objects.equals(this.variable, that.variable);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.attributeType, this.attributeStatus, this.component, this.variable});
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("attributeType", this.attributeType).add("attributeStatus", this.attributeStatus).add("component", this.component).add("variable", this.variable).toString();
    }
}
