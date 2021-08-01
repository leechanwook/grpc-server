package eu.chargetime.ocpp.model.basic;

import eu.chargetime.ocpp.model.Request;
import eu.chargetime.ocpp.model.basic.types.BootReasonEnumType;
import eu.chargetime.ocpp.model.basic.types.ChargingStationType;
import eu.chargetime.ocpp.model.validation.RequiredValidator;

import java.util.Objects;

public class BootNotificationRequest implements Request {
    private transient RequiredValidator validator = new RequiredValidator();
    private BootReasonEnumType reason;
    private ChargingStationType chargingStation;

    public BootNotificationRequest() {
    }

    public BootReasonEnumType getReason() {
        return this.reason;
    }

    public void setReason(BootReasonEnumType reason) {
        this.validator.validate(reason);
        this.reason = reason;
    }

    public ChargingStationType getChargingStation() {
        return this.chargingStation;
    }

    public void setChargingStation(ChargingStationType chargingStation) {
        this.chargingStation = chargingStation;
    }

    public boolean validate() {
        return this.validator.safeValidate(this.reason) && this.validator.safeValidate(this.chargingStation) && this.chargingStation.validate();
    }

    public boolean transactionRelated() {
        return false;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            BootNotificationRequest that = (BootNotificationRequest)o;
            return Objects.equals(this.reason, that.reason);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.reason, this.chargingStation});
    }

    public String toString() {
        return "BootNotificationRequest{validator=" + this.validator + ", reason=" + this.reason + ", chargingStation=" + this.chargingStation + '}';
    }
}
