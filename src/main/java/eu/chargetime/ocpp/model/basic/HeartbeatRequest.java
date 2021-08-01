package eu.chargetime.ocpp.model.basic;

import eu.chargetime.ocpp.model.Request;

public class HeartbeatRequest implements Request {
    public HeartbeatRequest() {
    }

    public boolean transactionRelated() {
        return true;
    }

    public boolean validate() {
        return true;
    }

    public String toString() {
        return super.toString();
    }
}
