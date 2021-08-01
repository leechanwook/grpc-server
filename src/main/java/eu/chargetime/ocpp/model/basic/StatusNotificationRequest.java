package eu.chargetime.ocpp.model.basic;

import eu.chargetime.ocpp.model.Request;
import eu.chargetime.ocpp.model.basic.types.ChargePointErrorCodeEnumType;
import eu.chargetime.ocpp.model.basic.types.ChargePointStatusEnumType;
import eu.chargetime.ocpp.model.basic.types.ConnectorStatusEnumType;

import java.time.ZonedDateTime;
import java.util.Objects;

public class StatusNotificationRequest implements Request {
    private static final String ERROR_MESSAGE = "Exceeds limit of %s chars";
    private Integer connectorId;
    private ConnectorStatusEnumType connectorStatus;
    private Integer evseId;
    private ZonedDateTime timestamp;
    private Integer status_Hyundai_H03;
    private ChargePointStatusEnumType status;
    private String apiNumber;
    private ZonedDateTime updateTime;
    private String soc;
    private String powerValue;
    private Integer payAmount;
    private String duration;
    private Integer remain;
    private String chargingId;
    private String vendorId;
    private String info;
    private ChargePointErrorCodeEnumType errorCode;

    public StatusNotificationRequest() {
    }

    public static String getErrorMessage() {
        return "Exceeds limit of %s chars";
    }

    public Integer getConnectorId() {
        return this.connectorId;
    }

    public void setConnectorId(Integer connectorId) {
        this.connectorId = connectorId;
    }

    public ConnectorStatusEnumType getConnectorStatus() {
        return this.connectorStatus;
    }

    public void setConnectorStatus(ConnectorStatusEnumType connectorStatus) {
        this.connectorStatus = connectorStatus;
    }

    public Integer getEvseId() {
        return this.evseId;
    }

    public void setEvseId(Integer evseId) {
        this.evseId = evseId;
    }

    public ZonedDateTime getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(ZonedDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getStatus_Hyundai_H03() {
        return this.status_Hyundai_H03;
    }

    public void setStatus_Hyundai_H03(Integer status_Hyundai_H03) {
        this.status_Hyundai_H03 = status_Hyundai_H03;
    }

    public ChargePointStatusEnumType getStatus() {
        return this.status;
    }

    public void setStatus(ChargePointStatusEnumType status) {
        this.status = status;
    }

    public String getApiNumber() {
        return this.apiNumber;
    }

    public void setApiNumber(String apiNumber) {
        this.apiNumber = apiNumber;
    }

    public ZonedDateTime getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(ZonedDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public String getSoc() {
        return this.soc;
    }

    public void setSoc(String soc) {
        this.soc = soc;
    }

    public String getPowerValue() {
        return this.powerValue;
    }

    public void setPowerValue(String powerValue) {
        this.powerValue = powerValue;
    }

    public Integer getPayAmount() {
        return this.payAmount;
    }

    public void setPayAmount(Integer payAmount) {
        this.payAmount = payAmount;
    }

    public String getDuration() {
        return this.duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Integer getRemain() {
        return this.remain;
    }

    public void setRemain(Integer remain) {
        this.remain = remain;
    }

    public String getChargingId() {
        return this.chargingId;
    }

    public void setChargingId(String chargingId) {
        this.chargingId = chargingId;
    }

    public String getVendorId() {
        return this.vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public String getInfo() {
        return this.info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public ChargePointErrorCodeEnumType getErrorCode() {
        return this.errorCode;
    }

    public void setErrorCode(ChargePointErrorCodeEnumType errorCode) {
        this.errorCode = errorCode;
    }

    private static String createErrorMessage(int maxLength) {
        return String.format("Exceeds limit of %s chars", maxLength);
    }

    public boolean validate() {
        return true;
    }

    public boolean transactionRelated() {
        return false;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            StatusNotificationRequest that = (StatusNotificationRequest)o;
            return Objects.equals(this.connectorId, that.connectorId) && this.connectorStatus == that.connectorStatus && Objects.equals(this.evseId, that.evseId) && Objects.equals(this.timestamp, that.timestamp) && Objects.equals(this.status_Hyundai_H03, that.status_Hyundai_H03) && this.status == that.status && Objects.equals(this.apiNumber, that.apiNumber) && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.soc, that.soc) && Objects.equals(this.powerValue, that.powerValue) && Objects.equals(this.payAmount, that.payAmount) && Objects.equals(this.duration, that.duration) && Objects.equals(this.remain, that.remain) && Objects.equals(this.chargingId, that.chargingId) && Objects.equals(this.vendorId, that.vendorId) && Objects.equals(this.info, that.info) && this.errorCode == that.errorCode;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.connectorId, this.connectorStatus, this.evseId, this.timestamp, this.status_Hyundai_H03, this.status, this.apiNumber, this.updateTime, this.soc, this.powerValue, this.payAmount, this.duration, this.remain, this.chargingId, this.vendorId, this.info, this.errorCode});
    }

    public String toString() {
        return "StatusNotificationRequest{connectorId=" + this.connectorId + ", connectorStatus=" + this.connectorStatus + ", evseId=" + this.evseId + ", timestamp=" + this.timestamp + ", status_Hyundai_H03=" + this.status_Hyundai_H03 + ", status=" + this.status + ", apiNumber='" + this.apiNumber + '\'' + ", updateTime=" + this.updateTime + ", soc=" + this.soc + ", powerValue=" + this.powerValue + ", payAmount=" + this.payAmount + ", duration=" + this.duration + ", remain=" + this.remain + ", chargingId='" + this.chargingId + '\'' + ", vendorId='" + this.vendorId + '\'' + ", info='" + this.info + '\'' + ", errorCode=" + this.errorCode + '}';
    }
}
