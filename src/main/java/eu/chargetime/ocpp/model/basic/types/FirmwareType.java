package eu.chargetime.ocpp.model.basic.types;

import lombok.Getter;
import lombok.Setter;

import java.time.ZonedDateTime;

@Setter
@Getter
public class FirmwareType {
    String location;
    ZonedDateTime retrieveDateTime;
    ZonedDateTime installDateTime;
    String signingCertificate;
    String signature;
}
