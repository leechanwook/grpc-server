package eu.chargetime.ocpp.model.basic;

import eu.chargetime.ocpp.model.Request;
import eu.chargetime.ocpp.model.basic.types.ChargingLimitType;
import eu.chargetime.ocpp.model.basic.types.ChargingScheduleType;

public class NotifyChargingLimitRequest implements Request {
    private Integer evseId;
    private ChargingLimitType chargingLimit;
    private ChargingScheduleType chargingSchedule;

    public NotifyChargingLimitRequest() {
    }

    public Integer getEvseId() {
        return this.evseId;
    }

    public void setEvseId(Integer evseId) {
        this.evseId = evseId;
    }

    public ChargingLimitType getChargingLimit() {
        return this.chargingLimit;
    }

    public void setChargingLimit(ChargingLimitType chargingLimit) {
        this.chargingLimit = chargingLimit;
    }

    public ChargingScheduleType getChargingSchedule() {
        return this.chargingSchedule;
    }

    public void setChargingSchedule(ChargingScheduleType chargingSchedule) {
        this.chargingSchedule = chargingSchedule;
    }

    public boolean transactionRelated() {
        return true;
    }

    public boolean validate() {
        return true;
    }

    public String toString() {
        return "NotifyChargingLimitRequest{evseId=" + this.evseId + ", chargingLimit=" + this.chargingLimit + ", chargingSchedule=" + this.chargingSchedule + '}';
    }
}
