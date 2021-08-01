package eu.chargetime.ocpp.model.basic;

import eu.chargetime.ocpp.model.Confirmation;
import eu.chargetime.ocpp.model.basic.types.IdTokenInfoType;
import eu.chargetime.ocpp.model.basic.types.MessageContentType;

public class TransactionEventConfirmation implements Confirmation {
    private double totalCost;
    private Integer chargingPriority;
    private IdTokenInfoType idTokenInfo;
    private MessageContentType updatedPersonalMessage;

    public TransactionEventConfirmation() {
    }

    public double getTotalCost() {
        return this.totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public Integer getChargingPriority() {
        return this.chargingPriority;
    }

    public void setChargingPriority(Integer chargingPriority) {
        this.chargingPriority = chargingPriority;
    }

    public IdTokenInfoType getIdTokenInfo() {
        return this.idTokenInfo;
    }

    public void setIdTokenInfo(IdTokenInfoType idTokenInfo) {
        this.idTokenInfo = idTokenInfo;
    }

    public MessageContentType getUpdatedPersonalMessage() {
        return this.updatedPersonalMessage;
    }

    public void setUpdatedPersonalMessage(MessageContentType updatedPersonalMessage) {
        this.updatedPersonalMessage = updatedPersonalMessage;
    }

    public boolean validate() {
        return true;
    }
}
