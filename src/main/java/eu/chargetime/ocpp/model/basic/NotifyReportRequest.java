package eu.chargetime.ocpp.model.basic;

import eu.chargetime.ocpp.model.Request;
import eu.chargetime.ocpp.model.basic.types.ReportDataType;
import lombok.Getter;
import lombok.Setter;

import java.time.ZonedDateTime;
import java.util.List;

@Getter
@Setter
public class NotifyReportRequest implements Request {
    Integer requestId;
    ZonedDateTime generatedAt;
    Boolean tbc;
    Integer seqNo;
    List<ReportDataType> reportData;

    @Override
    public boolean transactionRelated() {
        return false;
    }

    @Override
    public boolean validate() {
        return true;
    }
}
