package eu.chargetime.ocpp.model.basic.types;

import lombok.Getter;
import lombok.Setter;

import java.time.ZonedDateTime;

@Getter
@Setter
public class LogParametersType {
    String remoteLocation;
    ZonedDateTime oldestTimestamp;
    ZonedDateTime latestTimestamp;
}
