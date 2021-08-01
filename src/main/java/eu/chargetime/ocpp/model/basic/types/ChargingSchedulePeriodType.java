package eu.chargetime.ocpp.model.basic.types;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ChargingSchedulePeriodType {
    private Integer startPeriod;
    private double limit;
    private Integer numberPhases;
    private Integer phaseToUse;
}
