package eu.chargetime.ocpp.model.basic.types;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class StatusInfoType {
    String reasonCode;
    String additionalInfo;
}
