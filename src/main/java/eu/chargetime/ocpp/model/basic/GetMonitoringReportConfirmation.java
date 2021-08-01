package eu.chargetime.ocpp.model.basic;

import eu.chargetime.ocpp.model.Confirmation;
import eu.chargetime.ocpp.model.basic.types.GenericDeviceModelStatusEnumType;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class GetMonitoringReportConfirmation implements Confirmation {
    GenericDeviceModelStatusEnumType status;

    @Override
    public boolean validate() {
        return true;
    }
}
