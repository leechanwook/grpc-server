package eu.chargetime.ocpp.model.basic.types;

import eu.chargetime.ocpp.utilities.MoreObjects;

import java.util.Objects;

public class EVSEType {
    private int id;
    private Integer connectorId;

    public EVSEType() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
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
            EVSEType that = (EVSEType)o;
            return Objects.equals(this.id, that.id) && Objects.equals(this.connectorId, that.connectorId);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.id, this.connectorId});
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("id", this.id).add("connectorId", this.connectorId).toString();
    }
}
