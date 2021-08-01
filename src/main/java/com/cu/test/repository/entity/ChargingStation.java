package com.cu.test.repository.entity;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

@Setter
@Getter
public class ChargingStation {
    String chargingStationId;
    String endpointAddress;
    String ocppProtocol;
    String registrationStatus;
    String chargePointVendor;
    String chargePointModel;
    String chargePointSerialNumber;
    String chargeBoxSerialNumber;
    String fwVersion;
    String fwUpdateStatus;
    ZonedDateTime fwUpdateTimestamp;
    String iccid;
    String imsi;
    String meterType;
    String meterSerialNumber;
    String diagnosticsStatus;
    ZonedDateTime diagnosticsTimestamp;
    ZonedDateTime lastHeartbeatTimestamp;
    String description;
    String note;
    BigDecimal locationLatitude;
    BigDecimal locationLongitude;
    Integer addressPk;
    String adminAddress;
    Boolean insertConnectorStatusAfterTransactionMsg;
    String reason;
    String name;
}
