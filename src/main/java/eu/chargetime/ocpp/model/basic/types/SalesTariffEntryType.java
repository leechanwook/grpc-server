package eu.chargetime.ocpp.model.basic.types;

import java.util.List;

public class SalesTariffEntryType {
    Integer ePriceLevel;
    RelativeTimeIntervalType relativeTimeInterval;
    List<ConsumptionCostType> consumptionCost;
}
