package com.cu.test.repository;

import com.cu.test.repository.entity.ChargingStation;
import org.springframework.stereotype.Repository;

@Repository
public class ChargingStationRepository {

    public ChargingStation findChargePointByChargingStationId(String chargingStationId){
        return null;
    };
    public int updateChargingStation(ChargingStation chargingStation){
        return 0;
    };

}
