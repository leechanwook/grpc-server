package eu.chargetime.ocpp.model.basic;

import eu.chargetime.ocpp.model.Request;
import eu.chargetime.ocpp.model.basic.types.ChargingScheduleType;

import java.time.ZonedDateTime;

public class NotifyEVChargingScheduleRequest implements Request {
    private ZonedDateTime timeBase;
    private Integer evseId;
    private ChargingScheduleType chargingSchedule;

    public NotifyEVChargingScheduleRequest() {
    }

    public ZonedDateTime getTimeBase() {
        return this.timeBase;
    }

    public void setTimeBase(ZonedDateTime timeBase) {
        this.timeBase = timeBase;
    }

    public Integer getEvseId() {
        return this.evseId;
    }

    public void setEvseId(Integer evseId) {
        this.evseId = evseId;
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
        return "NotifyEVChargingScheduleRequest{timeBase=" + this.timeBase + ", evseId=" + this.evseId + ", chargingSchedule=" + this.chargingSchedule + '}';
    }
}
