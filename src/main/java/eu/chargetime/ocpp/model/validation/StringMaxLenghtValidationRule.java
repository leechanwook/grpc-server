package eu.chargetime.ocpp.model.validation;

import eu.chargetime.ocpp.PropertyConstraintException;

public class StringMaxLenghtValidationRule implements IValidationRule {
    private static final String ERROR_MESSAGE = "Exceeded limit of %s chars";
    private final int maxLenght;

    public StringMaxLenghtValidationRule(int maxLength) {
        this.maxLenght = maxLength;
    }

    public void validate(String value) throws PropertyConstraintException {
        if (value.length() > this.maxLenght) {
            throw new PropertyConstraintException(value.length(), String.format("Exceeded limit of %s chars", this.maxLenght));
        }
    }
}
