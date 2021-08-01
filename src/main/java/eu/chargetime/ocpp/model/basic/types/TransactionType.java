package eu.chargetime.ocpp.model.basic.types;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TransactionType {
    private String transactionId;
    private ChargingStateEnumType chargingState;
    private Integer timeSpentCharging;
    private ReasonEnumType stoppedReason;
    private Integer remoteStartId;

}
