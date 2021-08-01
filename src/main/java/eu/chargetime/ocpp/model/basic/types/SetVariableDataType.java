//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package eu.chargetime.ocpp.model.basic.types;

import eu.chargetime.ocpp.model.Validatable;
import eu.chargetime.ocpp.model.validation.OCPP2PrimDatatypes;
import eu.chargetime.ocpp.model.validation.RequiredValidator;
import eu.chargetime.ocpp.model.validation.Validator;
import eu.chargetime.ocpp.model.validation.ValidatorBuilder;
import eu.chargetime.ocpp.utilities.MoreObjects;

import java.util.Objects;

public class SetVariableDataType implements Validatable {
    private transient Validator<Object> requiredValidator = new RequiredValidator();
    private transient Validator attributeValueValidator = (new ValidatorBuilder()).setRequired(true).addRule(OCPP2PrimDatatypes.string1000()).build();
    private AttributeEnumType attributeType;
    private String attributeValue;
    private ComponentType component;
    private VariableType variable;

    public SetVariableDataType() {
    }

    public AttributeEnumType getAttributeType() {
        return this.attributeType;
    }

    public void setAttributeType(AttributeEnumType attributeType) {
        this.attributeType = attributeType;
    }

    public String getAttributeValue() {
        return this.attributeValue;
    }

    public void setAttributeValue(String attributeValue) {
        this.attributeValueValidator.validate(attributeValue);
        this.attributeValue = attributeValue;
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
        return this.attributeValueValidator.safeValidate(this.attributeValue) && this.requiredValidator.safeValidate(this.component) && this.requiredValidator.safeValidate(this.variable) && this.component.validate() && this.variable.validate();
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            SetVariableDataType that = (SetVariableDataType)o;
            return Objects.equals(this.attributeType, that.attributeType) && Objects.equals(this.attributeValue, that.attributeValue) && Objects.equals(this.component, that.component) && Objects.equals(this.variable, that.variable);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.attributeType, this.attributeValue, this.component, this.variable});
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("attributeType", this.attributeType).add("attributeValue", this.attributeValue).add("component", this.component).add("variable", this.variable).toString();
    }
}
