package com.cu.test.ocpp.service;

import com.cu.test.ocpp.data.OcppVersion;
import com.cu.test.repository.SettingsRepository;
import com.cu.test.repository.entity.ChargingStation;
import com.cu.test.repository.ChargingStationRepository;
import com.cu.test.repository.entity.Settings;
import eu.chargetime.ocpp.model.Confirmation;
import eu.chargetime.ocpp.model.basic.BootNotificationConfirmation;
import eu.chargetime.ocpp.model.basic.BootNotificationRequest;
import eu.chargetime.ocpp.model.basic.StatusNotificationConfirmation;
import eu.chargetime.ocpp.model.basic.StatusNotificationRequest;
import eu.chargetime.ocpp.model.basic.types.ChargingStationType;
import eu.chargetime.ocpp.model.basic.types.ModemType;
import eu.chargetime.ocpp.model.basic.types.RegistrationStatusEnumType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;
import java.util.Optional;

@Slf4j
@Service
public class Ocpp201Service {

    @Value("${app.id:abcd}")
    String appId;

    @Autowired
    ChargingStationRepository chargingStationRepository;

    @Autowired
    SettingsRepository settingsRepository;

    public String getOcppProtocol() {
        return OcppVersion.V_201.getValue();
    }

    public Confirmation statusNotification(String chargingStationId, StatusNotificationRequest request){
        log.debug("statusNotification");


        StatusNotificationConfirmation statusNotificationConfirmation = new StatusNotificationConfirmation();
        return statusNotificationConfirmation;
    }

    public Confirmation bootNotificationWithTransport(String chargingStationId, BootNotificationRequest request){
//        String chargingStationId = context.getChargingStationId();

        log.debug("bootNotification");

        //TODO:chargingStationId 로 charging station 정보 조회
        ChargingStation chargingStation = chargingStationRepository.findChargePointByChargingStationId(chargingStationId);
        Optional<RegistrationStatusEnumType> status = chargingStation == null? Optional.ofNullable(null):Optional.ofNullable(RegistrationStatusEnumType.valueOf(chargingStation.getRegistrationStatus()));
        ZonedDateTime now = ZonedDateTime.now();
        if(!status.isPresent()) {
            log.error("The chargingStationIdentity '{}' is NOT in database.", chargingStationId);
        }else {
            log.info("The boot of the ChargingStation '{}' with registration status '{}' is acknowledged.", chargingStationId, status);

            chargingStation.setOcppProtocol(getOcppProtocol());

            chargingStation.setReason(request.getReason().toString());						//필수
            ChargingStationType chargingStateType = request.getChargingStation();
            if (chargingStateType != null){
                chargingStation.setChargePointSerialNumber(chargingStateType.getSerialNumber());		//선택
                chargingStation.setChargeBoxSerialNumber(chargingStateType.getSerialNumber());			//선택
                chargingStation.setChargePointModel(chargingStateType.getModel());						//필수
                chargingStation.setChargePointVendor(chargingStateType.getVendorName());				//필수
                chargingStation.setFwVersion(chargingStateType.getFirmwareVersion());					//선택
                ModemType modemType = chargingStateType.getModem();									//선택
                if(modemType != null) {
                    chargingStation.setIccid(modemType.getIccid());										//선택
                    chargingStation.setImsi(modemType.getImsi());										//선택
                }
            }
            chargingStation.setChargingStationId(chargingStationId);
            chargingStation.setLastHeartbeatTimestamp(now);

            chargingStationRepository.updateChargingStation(chargingStation);
        }
        log.debug("appId["+appId+"]");
        Settings settings = settingsRepository.findById(appId);
        BootNotificationConfirmation bootNotificationConfirmation = new BootNotificationConfirmation();
        bootNotificationConfirmation.setCurrentTime(now);
        bootNotificationConfirmation.setStatus(status.orElse(RegistrationStatusEnumType.Rejected));
        bootNotificationConfirmation.setInterval(30);		//TODO: setting Db에서 조회
        log.debug("aa["+bootNotificationConfirmation.toString()+"]");
        return bootNotificationConfirmation;
    }

}
