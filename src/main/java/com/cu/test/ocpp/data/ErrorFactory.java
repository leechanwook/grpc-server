package com.cu.test.ocpp.data;

import org.json.JSONArray;

public class ErrorFactory {

    public static String genericDeserializeError(String messageId, String details) {
        return MessageFactory.callErrorMessage(messageId, ErrorCode.GenericError,
                "The incoming string could not be parsed into an array. Is the JSON syntactically correct?", details);
    }

    public static String payloadDeserializeError(String messageId, String details) {
        return MessageFactory.callErrorMessage(messageId, ErrorCode.FormationViolation,
                "The payload for action could not be deserialized", details);
    }

    public static String payloadSerializeError(String messageId, String details) {
        return MessageFactory.callErrorMessage(messageId, ErrorCode.InternalError,
                "The payload for action could not be serialized", details);
    }

    public static String actionNotFound(String messageId, String action) {
        return MessageFactory.callErrorMessage(messageId, ErrorCode.NotImplemented,
                "The action '" + action + "' you are looking for is not found", null);
    }

    public static String payloadProcessingError(String messageId, String details) {
        return MessageFactory.callErrorMessage(messageId, ErrorCode.InternalError,
                "Internal services failed while processing of the payload", details);
    }

}
