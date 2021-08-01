package eu.chargetime.ocpp.model.basic;

import eu.chargetime.ocpp.model.Request;
import eu.chargetime.ocpp.model.basic.types.MeterValuesType;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class MeterValuesRequest implements Request {

    Integer evseId;
    List<MeterValuesType> meterValue;

    @Override
    public boolean transactionRelated() {
        return false;
    }

    @Override
    public boolean validate() {
        return true;
    }
}
