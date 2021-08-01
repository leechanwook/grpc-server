package eu.chargetime.ocpp.model.basic.types;

import eu.chargetime.ocpp.model.Validatable;
import eu.chargetime.ocpp.model.validation.RequiredValidator;
import eu.chargetime.ocpp.model.validation.Validator;
import eu.chargetime.ocpp.utilities.MoreObjects;

import java.util.Objects;

public class GetVariableDataType implements Validatable {
    private transient Validator<Object> requiredValidator = new RequiredValidator();
    private AttributeEnumType attributeType;
    private ComponentType component;
    private VariableType variable;

    public GetVariableDataType() {
    }

    public AttributeEnumType getAttributeType() {
        return this.attributeType;
    }

    public void setAttributeType(AttributeEnumType attributeType) {
        this.attributeType = attributeType;
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
        return this.requiredValidator.safeValidate(this.component) && this.requiredValidator.safeValidate(this.variable) && this.component.validate() && this.variable.validate();
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            GetVariableDataType that = (GetVariableDataType)o;
            return Objects.equals(this.attributeType, that.attributeType) && Objects.equals(this.component, that.component) && Objects.equals(this.variable, that.variable);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.attributeType, this.component, this.variable});
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("attributeType", this.attributeType).add("component", this.component).add("variable", this.variable).toString();
    }
}
