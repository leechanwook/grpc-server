package com.cu.test.ocpp.data;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum MessageType {
    CALL(2),
    CALL_RESULT(3),
    CALL_ERROR(4);

    private final int typeNumber;

    public static MessageType fromTypeNumber(int typeNumber) {
        for (MessageType messageType : MessageType.values()) {
            if (messageType.typeNumber == typeNumber) {
                return messageType;
            }
        }
        throw new IllegalArgumentException(typeNumber + " is an unknown message type");
    }

}
