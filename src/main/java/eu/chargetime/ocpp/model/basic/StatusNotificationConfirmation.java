package eu.chargetime.ocpp.model.basic;

import eu.chargetime.ocpp.model.Confirmation;
import eu.chargetime.ocpp.model.basic.types.ConnectorStatusEnumType;

import java.time.ZonedDateTime;
import java.util.Objects;

public class StatusNotificationConfirmation implements Confirmation {
    private Integer connectorId;
    private ConnectorStatusEnumType connectorStatus;
    private Integer evseId;
    private ZonedDateTime timestamp;

    public StatusNotificationConfirmation() {
    }

    public Integer getConnectorId() {
        return this.connectorId;
    }

    public void setConnectorId(Integer connectorId) {
        this.connectorId = connectorId;
    }

    public boolean validate() {
        return true;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            StatusNotificationConfirmation that = (StatusNotificationConfirmation)o;
            return Objects.equals(this.connectorId, that.connectorId) && this.connectorStatus == that.connectorStatus && Objects.equals(this.evseId, that.evseId) && Objects.equals(this.timestamp, that.timestamp);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.connectorId, this.connectorStatus, this.evseId, this.timestamp});
    }

    public String toString() {
        return "StatusNotificationConfirmation{connectorId=" + this.connectorId + ", connectorStatus=" + this.connectorStatus + ", evseId=" + this.evseId + ", timestamp=" + this.timestamp + '}';
    }
}
