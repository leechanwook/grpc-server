package eu.chargetime.ocpp.model.basic;

import eu.chargetime.ocpp.model.Request;
import eu.chargetime.ocpp.model.basic.types.*;
import lombok.Getter;
import lombok.Setter;

import java.time.ZonedDateTime;
import java.util.List;

@Getter
@Setter
public class TransactionEventRequest implements Request {

    private TransactionEventEnumType eventType;
    private ZonedDateTime timestamp;
    private TriggerReasonEnumType triggerReason;
    private Integer seqNo;
    private boolean offline;
    private Integer numberOfPhasesUsed;
    private Integer cableMaxCurrent;
    private Integer reservationId;
    private TransactionType transactionInfo;

    private EVSEType evse;
    private List<MeterValueType> meterValue;




    private IdTokenType idToken;






    @Override
    public boolean transactionRelated() {
        return false;
    }

    @Override
    public boolean validate() {
        return true;
    }
}
