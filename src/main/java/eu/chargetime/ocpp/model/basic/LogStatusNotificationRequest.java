package eu.chargetime.ocpp.model.basic;

import eu.chargetime.ocpp.model.Request;
import eu.chargetime.ocpp.model.basic.types.UploadLogStatusEnumType;

public class LogStatusNotificationRequest implements Request {
    private UploadLogStatusEnumType status;
    private Integer requestId;

    public LogStatusNotificationRequest() {
    }

    public boolean transactionRelated() {
        return true;
    }

    public boolean validate() {
        return true;
    }

    public String toString() {
        return "LogStatusNotificationRequest{status=" + this.status + ", requestId=" + this.requestId + '}';
    }
}
