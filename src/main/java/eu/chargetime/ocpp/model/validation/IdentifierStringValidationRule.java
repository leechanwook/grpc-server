package eu.chargetime.ocpp.model.validation;

import eu.chargetime.ocpp.PropertyConstraintException;

import java.util.regex.Pattern;

public class IdentifierStringValidationRule implements IValidationRule {
    private final String ERROR_MESSAGE = "Illegal character(s) in IdentifierString.";
    private final String PATTERN = "([a-zA-Z0-9]|\\*|\\-|\\_|\\=|\\:|\\+|\\||\\@|\\.)+";

    public IdentifierStringValidationRule() {
    }

    public void validate(String value) throws PropertyConstraintException {
        if (!this.match(value)) {
            throw new PropertyConstraintException(value, "Illegal character(s) in IdentifierString.");
        }
    }

    private boolean match(String value) {
        Pattern pattern = Pattern.compile("([a-zA-Z0-9]|\\*|\\-|\\_|\\=|\\:|\\+|\\||\\@|\\.)+");
        return pattern.matcher(value).matches();
    }
}
