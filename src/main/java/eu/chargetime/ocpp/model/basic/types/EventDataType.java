package eu.chargetime.ocpp.model.basic.types;

import lombok.Getter;
import lombok.Setter;

import java.time.ZonedDateTime;

@Getter
@Setter
public class EventDataType {
    Integer eventId;
    ZonedDateTime timestamp;
    EventTriggerEnumType trigger;
    Integer cause;
    String actualValue;
    String techCode;
    String techInfo;
    Boolean cleared;
    ComponentType component;
    VariableType variable;
    VariableMonitoringType variableMonitoringEvent;
}
