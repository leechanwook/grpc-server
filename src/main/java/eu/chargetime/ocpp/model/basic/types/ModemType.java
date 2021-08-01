package eu.chargetime.ocpp.model.basic.types;

import eu.chargetime.ocpp.model.Validatable;
import eu.chargetime.ocpp.model.validation.OCPP2PrimDatatypes;
import eu.chargetime.ocpp.model.validation.Validator;
import eu.chargetime.ocpp.model.validation.ValidatorBuilder;
import eu.chargetime.ocpp.utilities.MoreObjects;

import java.util.Objects;

public class ModemType implements Validatable {
    private transient Validator validator = (new ValidatorBuilder()).addRule(OCPP2PrimDatatypes.identifierString()).addRule(OCPP2PrimDatatypes.string20()).build();
    private String iccid;
    private String imsi;

    public ModemType() {
    }

    public String getIccid() {
        return this.iccid;
    }

    public void setIccid(String iccid) {
        this.validator.validate(iccid);
        this.iccid = iccid;
    }

    public String getImsi() {
        return this.imsi;
    }

    public void setImsi(String imsi) {
        this.validator.validate(imsi);
        this.imsi = imsi;
    }

    public boolean validate() {
        return this.validator.safeValidate(this.iccid) && this.validator.safeValidate(this.imsi);
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            ModemType that = (ModemType)o;
            return Objects.equals(this.iccid, that.iccid) && Objects.equals(this.imsi, that.imsi);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.iccid, this.imsi});
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("iccid", this.iccid).add("imsi", this.imsi).toString();
    }
}
