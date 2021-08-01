package eu.chargetime.ocpp.model.basic.types;

import lombok.Getter;
import lombok.Setter;

import java.time.ZonedDateTime;
import java.util.List;

@Getter
@Setter
public class MeterValuesType {
    ZonedDateTime timestamp;
    List<SampledValueType> sampledValue;
}
