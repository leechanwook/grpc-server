package eu.chargetime.ocpp.model.basic;

import eu.chargetime.ocpp.model.Request;
import eu.chargetime.ocpp.model.basic.types.ReportBaseEnumType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetBaseReportRequest implements Request {
    Integer requestId;
    ReportBaseEnumType reportBase;

    @Override
    public boolean transactionRelated() {
        return false;
    }

    @Override
    public boolean validate() {
        return true;
    }
}
