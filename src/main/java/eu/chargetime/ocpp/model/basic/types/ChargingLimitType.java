package eu.chargetime.ocpp.model.basic.types;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ChargingLimitType {
    private ChargingLimitSourceEnumType chargingLimitSource;
    private boolean isGridCritical;
}
