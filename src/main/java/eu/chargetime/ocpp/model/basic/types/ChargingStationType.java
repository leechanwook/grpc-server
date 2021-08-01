package eu.chargetime.ocpp.model.basic.types;

import eu.chargetime.ocpp.model.validation.OCPP2PrimDatatypes;
import eu.chargetime.ocpp.model.validation.Validator;
import eu.chargetime.ocpp.model.validation.ValidatorBuilder;
import eu.chargetime.ocpp.utilities.MoreObjects;

import java.util.Objects;

public class ChargingStationType {
    private transient Validator serialNumberValidator = (new ValidatorBuilder()).addRule(OCPP2PrimDatatypes.string20()).build();
    private transient Validator modelValidator = (new ValidatorBuilder()).setRequired(true).addRule(OCPP2PrimDatatypes.string20()).build();
    private transient Validator vendorNameValidator = (new ValidatorBuilder()).setRequired(true).addRule(OCPP2PrimDatatypes.string50()).build();
    private transient Validator firmwareVersionValidator = (new ValidatorBuilder()).addRule(OCPP2PrimDatatypes.string50()).build();
    private String serialNumber;
    private String model;
    private String vendorName;
    private String firmwareVersion;
    private ModemType modem;

    public ChargingStationType() {
    }

    public String getSerialNumber() {
        return this.serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumberValidator.validate(serialNumber);
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.modelValidator.validate(model);
        this.model = model;
    }

    public String getVendorName() {
        return this.vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorNameValidator.validate(vendorName);
        this.vendorName = vendorName;
    }

    public String getFirmwareVersion() {
        return this.firmwareVersion;
    }

    public void setFirmwareVersion(String firmwareVersion) {
        this.firmwareVersionValidator.validate(firmwareVersion);
        this.firmwareVersion = firmwareVersion;
    }

    public ModemType getModem() {
        return this.modem;
    }

    public void setModem(ModemType modem) {
        this.modem = modem;
    }

    public boolean validate() {
        return this.serialNumberValidator.safeValidate(this.serialNumber) && this.modelValidator.safeValidate(this.model) && this.vendorNameValidator.safeValidate(this.vendorName) && this.firmwareVersionValidator.safeValidate(this.firmwareVersion) && (this.modem == null || this.modem.validate());
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            ChargingStationType that = (ChargingStationType)o;
            return Objects.equals(this.serialNumber, that.serialNumber) && Objects.equals(this.model, that.model) && Objects.equals(this.vendorName, that.vendorName) && Objects.equals(this.firmwareVersion, that.firmwareVersion) && Objects.equals(this.modem, that.modem);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.serialNumber, this.model, this.vendorName, this.firmwareVersion, this.modem});
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("serialNumber", this.serialNumber).add("eu/chargetime/ocpp/model", this.model).add("vendorName", this.vendorName).add("firmwareVersion", this.firmwareVersion).add("modem", this.modem).toString();
    }
}
