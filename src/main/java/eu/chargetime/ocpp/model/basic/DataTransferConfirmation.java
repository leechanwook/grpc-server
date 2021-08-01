package eu.chargetime.ocpp.model.basic;

import eu.chargetime.ocpp.model.Confirmation;
import eu.chargetime.ocpp.model.basic.types.DataTransferStatusEnumType;
import eu.chargetime.ocpp.utilities.MoreObjects;

import java.util.Objects;

public class DataTransferConfirmation implements Confirmation {
    private DataTransferStatusEnumType status;
    private String data;

    public DataTransferConfirmation() {
    }

    public DataTransferConfirmation(DataTransferStatusEnumType status) {
        this.setStatus(status);
    }

    public DataTransferStatusEnumType getStatus() {
        return this.status;
    }

    public void setStatus(DataTransferStatusEnumType status) {
        this.status = status;
    }

    /** @deprecated */
    @Deprecated
    public DataTransferStatusEnumType objStatus() {
        return this.status;
    }

    public Object getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public boolean validate() {
        return this.status != null;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            DataTransferConfirmation that = (DataTransferConfirmation)o;
            return this.status == that.status && Objects.equals(this.data, that.data);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.status, this.data});
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("status", this.status).add("data", this.data).add("isValid", this.validate()).toString();
    }
}
