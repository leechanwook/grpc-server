package eu.chargetime.ocpp.model.basic.types;

public class MessageContentType {
    private MessageFormatEnumType format;
    private String language;
    private String content;

    public MessageContentType() {
    }

    public MessageFormatEnumType getFormat() {
        return this.format;
    }

    public void setFormat(MessageFormatEnumType format) {
        this.format = format;
    }

    public String getLanguage() {
        return this.language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
