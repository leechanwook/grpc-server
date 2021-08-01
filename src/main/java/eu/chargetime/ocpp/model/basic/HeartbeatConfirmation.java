//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package eu.chargetime.ocpp.model.basic;

import eu.chargetime.ocpp.model.Confirmation;
import eu.chargetime.ocpp.utilities.MoreObjects;

import java.time.ZonedDateTime;
import java.util.Objects;

public class HeartbeatConfirmation implements Confirmation {
    private ZonedDateTime currentTime;

    public HeartbeatConfirmation() {
    }

    public HeartbeatConfirmation(ZonedDateTime currentTime) {
        this.setCurrentTime(currentTime);
    }

    /** @deprecated */
    @Deprecated
    public ZonedDateTime objCurrentTime() {
        return this.currentTime;
    }

    public ZonedDateTime getCurrentTime() {
        return this.currentTime;
    }

    public void setCurrentTime(ZonedDateTime currentTime) {
        this.currentTime = currentTime;
    }

    public boolean validate() {
        return this.currentTime != null;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            HeartbeatConfirmation that = (HeartbeatConfirmation)o;
            return Objects.equals(this.currentTime, that.currentTime);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.currentTime});
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("currentTime", this.currentTime).toString();
    }
}
