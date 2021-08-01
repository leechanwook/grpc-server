package eu.chargetime.ocpp.model.basic;

import eu.chargetime.ocpp.model.Confirmation;
import eu.chargetime.ocpp.model.basic.types.RegistrationStatusEnumType;
import eu.chargetime.ocpp.model.validation.RequiredValidator;
import eu.chargetime.ocpp.utilities.MoreObjects;

import java.time.ZonedDateTime;
import java.util.Objects;

public class BootNotificationConfirmation implements Confirmation {
    private transient RequiredValidator validator = new RequiredValidator();
    private ZonedDateTime currentTime;
    private int interval;
    private RegistrationStatusEnumType status;

    public BootNotificationConfirmation() {
    }

    public ZonedDateTime getCurrentTime() {
        return this.currentTime;
    }

    public void setCurrentTime(ZonedDateTime currentTime) {
        this.validator.validate(currentTime);
        this.currentTime = currentTime;
    }

    public int getInterval() {
        return this.interval;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }

    public RegistrationStatusEnumType getStatus() {
        return this.status;
    }

    public void setStatus(RegistrationStatusEnumType status) {
        this.validator.validate(status);
        this.status = status;
    }

    public boolean validate() {
        return this.currentTime != null && this.interval > 0 && this.status != null;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            BootNotificationConfirmation that = (BootNotificationConfirmation)o;
            return this.currentTime.compareTo(that.currentTime) == 0 && Objects.equals(this.interval, that.interval) && Objects.equals(this.status, that.status);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.currentTime, this.interval, this.status});
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("currentTime", this.currentTime).add("interval", this.interval).add("status", this.status).toString();
    }
}
