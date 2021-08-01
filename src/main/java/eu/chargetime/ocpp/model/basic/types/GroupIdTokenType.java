package eu.chargetime.ocpp.model.basic.types;

public class GroupIdTokenType {
    private String idToken;
    private IdTokenEnumType type;

    public GroupIdTokenType() {
    }

    public String getIdToken() {
        return this.idToken;
    }

    public void setIdToken(String idToken) {
        this.idToken = idToken;
    }

    public IdTokenEnumType getType() {
        return this.type;
    }

    public void setType(IdTokenEnumType type) {
        this.type = type;
    }
}
