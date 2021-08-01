package eu.chargetime.ocpp.model.basic.types;

import java.time.ZonedDateTime;

public class IdTokenInfoType {
    private AuthorizationStatusEnumType status;
    private ZonedDateTime cacheExpiryDateTime;
    private Integer chargePriority;
    private String language1;
    private String language2;
    private GroupIdTokenType groupIdToken;
    private MessageContentType personalMessage;

    public IdTokenInfoType() {
    }

    public AuthorizationStatusEnumType getStatus() {
        return this.status;
    }

    public void setStatus(AuthorizationStatusEnumType status) {
        this.status = status;
    }

    public ZonedDateTime getCacheExpiryDateTime() {
        return this.cacheExpiryDateTime;
    }

    public void setCacheExpiryDateTime(ZonedDateTime cacheExpiryDateTime) {
        this.cacheExpiryDateTime = cacheExpiryDateTime;
    }

    public Integer getChargePriority() {
        return this.chargePriority;
    }

    public void setChargePriority(Integer chargePriority) {
        this.chargePriority = chargePriority;
    }

    public String getLanguage1() {
        return this.language1;
    }

    public void setLanguage1(String language1) {
        this.language1 = language1;
    }

    public String getLanguage2() {
        return this.language2;
    }

    public void setLanguage2(String language2) {
        this.language2 = language2;
    }

    public GroupIdTokenType getGroupIdToken() {
        return this.groupIdToken;
    }

    public void setGroupIdToken(GroupIdTokenType groupIdToken) {
        this.groupIdToken = groupIdToken;
    }

    public MessageContentType getPersonalMessage() {
        return this.personalMessage;
    }

    public void setPersonalMessage(MessageContentType personalMessage) {
        this.personalMessage = personalMessage;
    }
}
