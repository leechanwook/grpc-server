package eu.chargetime.ocpp.model.basic.types;

import eu.chargetime.ocpp.model.validation.OCPP2PrimDatatypes;
import eu.chargetime.ocpp.model.validation.Validator;
import eu.chargetime.ocpp.model.validation.ValidatorBuilder;
import eu.chargetime.ocpp.utilities.MoreObjects;

import java.util.Objects;

public class ComponentType {
    private transient Validator nameValidator = (new ValidatorBuilder()).setRequired(true).addRule(OCPP2PrimDatatypes.string50()).build();
    private transient Validator instanceValidator = (new ValidatorBuilder()).addRule(OCPP2PrimDatatypes.string50()).build();
    private String name;
    private String instance;
    private EVSEType evse;

    public ComponentType() {
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

    public EVSEType getEvse() {
        return this.evse;
    }

    public void setEvse(EVSEType evse) {
        this.evse = evse;
    }

    public boolean validate() {
        return this.nameValidator.safeValidate(this.name) && this.instanceValidator.safeValidate(this.instance) && (this.evse == null || this.evse.validate());
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            ComponentType that = (ComponentType)o;
            return Objects.equals(this.name, that.name) && Objects.equals(this.instance, that.instance) && Objects.equals(this.evse, that.evse);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.name, this.instance, this.evse});
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("name", this.name).add("instance", this.instance).add("evse", this.evse).toString();
    }
}
