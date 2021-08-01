package eu.chargetime.ocpp.model.basic;

import eu.chargetime.ocpp.PropertyConstraintException;
import eu.chargetime.ocpp.model.Request;
import eu.chargetime.ocpp.utilities.ModelUtil;
import eu.chargetime.ocpp.utilities.MoreObjects;

import java.util.Objects;

public class DataTransferRequest implements Request {
    private static final String ERROR_MESSAGE = "Exceeded limit of %s chars";
    private String vendorId;
    private String messageId;
    private String data;

    public DataTransferRequest() {
    }

    public DataTransferRequest(String vendorId) {
        this.vendorId = vendorId;
    }

    public boolean validate() {
        return this.isValidVendorId(this.vendorId);
    }

    public String getVendorId() {
        return this.vendorId;
    }

    public void setVendorId(String vendorId) {
        if (!this.isValidVendorId(vendorId)) {
            throw new PropertyConstraintException(vendorId.length(), this.createErrorMessage(255));
        } else {
            this.vendorId = vendorId;
        }
    }

    private boolean isValidVendorId(String vendorId) {
        return ModelUtil.validate(vendorId, 255);
    }

    public String getMessageId() {
        return this.messageId;
    }

    public void setMessageId(String messageId) {
        if (!this.isValidMessageId(messageId)) {
            throw new PropertyConstraintException(messageId.length(), this.createErrorMessage(50));
        } else {
            this.messageId = messageId;
        }
    }

    private boolean isValidMessageId(String messageId) {
        return ModelUtil.validate(messageId, 50);
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public boolean transactionRelated() {
        return false;
    }

    private String createErrorMessage(int maxLength) {
        return String.format("Exceeded limit of %s chars", maxLength);
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            DataTransferRequest that = (DataTransferRequest)o;
            return Objects.equals(this.vendorId, that.vendorId) && Objects.equals(this.messageId, that.messageId) && Objects.equals(this.data, that.data);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.vendorId, this.messageId, this.data});
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("vendorId", this.vendorId).add("messageId", this.messageId).add("data", this.data).add("isValid", this.validate()).toString();
    }
}
