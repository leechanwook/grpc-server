package eu.chargetime.ocpp.model.basic;

import eu.chargetime.ocpp.model.Request;
import eu.chargetime.ocpp.model.basic.types.FirmwareStatusEnumType;

public class FirmwareStatusNotificationRequest implements Request {
    private FirmwareStatusEnumType status;
    private Integer requestId;

    public FirmwareStatusNotificationRequest() {
    }

    public FirmwareStatusEnumType getStatus() {
        return this.status;
    }

    public void setStatus(FirmwareStatusEnumType status) {
        this.status = status;
    }

    public Integer getRequestId() {
        return this.requestId;
    }

    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    public boolean transactionRelated() {
        return true;
    }

    public boolean validate() {
        return true;
    }

    public String toString() {
        return "FirmwareStatusNotificationRequest{status=" + this.status + ", requestId=" + this.requestId + '}';
    }
}
