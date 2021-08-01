package eu.chargetime.ocpp.model.basic.types;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IdTokenType {
    private String IdToken;
    private IdTokenEnumType type;
    private AdditionalInfoType additionalInfo;
}
