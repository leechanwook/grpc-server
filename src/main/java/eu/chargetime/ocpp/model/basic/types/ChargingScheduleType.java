package eu.chargetime.ocpp.model.basic.types;

import lombok.Getter;
import lombok.Setter;

import java.time.ZonedDateTime;
import java.util.List;

@Getter
@Setter
public class ChargingScheduleType {
    Integer id;
    private ZonedDateTime startSchedule;
    private Integer duration;
    private ChargingRateUnitEnumType chargingRateUnit;
    private double minChargingRate;
    private List<ChargingSchedulePeriodType> chargingSchedulePeriod;
    private SalesTariffType salesTariff;
}
