package eu.chargetime.ocpp.model.basic.types;

import eu.chargetime.ocpp.model.Validatable;
import eu.chargetime.ocpp.model.validation.OCPP2PrimDatatypes;
import eu.chargetime.ocpp.model.validation.Validator;
import eu.chargetime.ocpp.model.validation.ValidatorBuilder;
import eu.chargetime.ocpp.utilities.MoreObjects;

import java.util.Objects;

public class VariableType implements Validatable {
    private transient Validator nameValidator = (new ValidatorBuilder()).setRequired(true).addRule(OCPP2PrimDatatypes.string50()).build();
    private transient Validator instanceValidator = (new ValidatorBuilder()).addRule(OCPP2PrimDatatypes.string50()).build();
    private String name;
    private String instance;

    public VariableType() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.nameValidator.validate(name);
        this.name = name;
    }

    public String getInstance() {
        return this.instance;
    }

    public void setInstance(String instance) {
        this.instanceValidator.validate(instance);
        this.instance = instance;
    }

    public boolean validate() {
        return this.nameValidator.safeValidate(this.name) && this.instanceValidator.safeValidate(this.instance);
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            VariableType that = (VariableType)o;
            return Objects.equals(this.name, that.name) && Objects.equals(this.instance, that.instance);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.name, this.instance});
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("name", this.name).add("instance", this.instance).toString();
    }
}
