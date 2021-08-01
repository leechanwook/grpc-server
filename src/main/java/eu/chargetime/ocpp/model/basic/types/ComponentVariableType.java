package eu.chargetime.ocpp.model.basic.types;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ComponentVariableType {
    ComponentType component;
    VariableType variable;
}
