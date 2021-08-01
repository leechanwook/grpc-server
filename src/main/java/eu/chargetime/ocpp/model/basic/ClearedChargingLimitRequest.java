package eu.chargetime.ocpp.model.basic;

import eu.chargetime.ocpp.model.Request;
import eu.chargetime.ocpp.model.basic.types.ChargingLimitSourceEnumType;

public class ClearedChargingLimitRequest implements Request {
    private Integer evseId;
    private ChargingLimitSourceEnumType chargingLimitSource;

    public ClearedChargingLimitRequest() {
    }

    public boolean transactionRelated() {
        return true;
    }

    public boolean validate() {
        return true;
    }

    public String toString() {
        return "ClearedChargingLimitRequest{evseId=" + this.evseId + ", chargingLimitSource=" + this.chargingLimitSource + '}';
    }
}
