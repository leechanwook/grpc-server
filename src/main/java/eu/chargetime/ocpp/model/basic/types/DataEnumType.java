package eu.chargetime.ocpp.model.basic.types;

import com.fasterxml.jackson.annotation.JsonValue;


public enum DataEnumType {
    string("string"),
    decimal("decimal"),
    integer("integer"),
    dateTime("dateTime"),
    Boolean("boolean"),
    OptionList("OptionList"),
    SequenceList("SequenceList"),
    MemberList("MemberList");

    private String typeCode;
    DataEnumType(String typeCode){
        this.typeCode = typeCode;
    }
    public String getValue() {
        return typeCode;
    }

    @JsonValue
    public String jsonValue() {
        return this.typeCode;
    }

    public static DataEnumType fromValue(String value) {
        switch (value) {
        case "string":
            return DataEnumType.string;
        case "decimal":
            return DataEnumType.decimal;
        case "integer":
            return DataEnumType.integer;
        case "dateTime":
            return DataEnumType.dateTime;
        case "boolean":
            return DataEnumType.Boolean;
        case "OptionList":
            return DataEnumType.OptionList;
        case "SequenceList":
            return DataEnumType.SequenceList;
        case "MemberList":
            return DataEnumType.MemberList;
        }
        return null;
    }




}
