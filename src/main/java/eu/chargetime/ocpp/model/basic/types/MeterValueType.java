package eu.chargetime.ocpp.model.basic.types;

import java.time.ZonedDateTime;
import java.util.List;

public class MeterValueType {
    private ZonedDateTime timestamp;
    private List<SampledValueType> sampledValue;

    public MeterValueType() {
    }

    public ZonedDateTime getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(ZonedDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public List<SampledValueType> getSampledValue() {
        return this.sampledValue;
    }

    public void setSampledValue(List<SampledValueType> sampledValue) {
        this.sampledValue = sampledValue;
    }
}
