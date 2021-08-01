package eu.chargetime.ocpp.model.basic;

import eu.chargetime.ocpp.model.Confirmation;
import eu.chargetime.ocpp.model.basic.types.StatusInfoType;
import eu.chargetime.ocpp.model.basic.types.UpdateFirmwareStatusEnumType;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UpdateFirmwareConfirmation  implements Confirmation {

    UpdateFirmwareStatusEnumType status;
    StatusInfoType statusInfo;

    @Override
    public boolean validate() {
        return true;
    }
}
