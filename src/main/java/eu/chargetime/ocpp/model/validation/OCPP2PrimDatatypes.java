package eu.chargetime.ocpp.model.validation;

public class OCPP2PrimDatatypes {
    Validator validator;

    public OCPP2PrimDatatypes() {
    }

    public static IValidationRule string50() {
        return new StringMaxLenghtValidationRule(50);
    }

    public static IValidationRule string20() {
        return new StringMaxLenghtValidationRule(20);
    }

    public static IValidationRule string1000() {
        return new StringMaxLenghtValidationRule(1000);
    }

    public static IValidationRule identifierString() {
        return new IdentifierStringValidationRule();
    }
}
