package com.cu.test.ocpp.data;

import org.json.JSONArray;

public class MessageFactory {

    public static String callMessage(String messageId, String action, String payload){
        JSONArray retJson = new JSONArray();
        retJson.put(MessageType.CALL.getTypeNumber());        //message type id
        retJson.put(messageId);                               //message id
        retJson.put(action);                                  //action
        retJson.put(payload);                                 //payload
        return retJson.toString();
    }

    public static String callResultMessage(String messageId, String payload){
        JSONArray retJson = new JSONArray();
        retJson.put(MessageType.CALL_RESULT.getTypeNumber());        //message type id
        retJson.put(messageId);                               //message id
        retJson.put(payload);                                  //action

        return retJson.toString();
    }


    public static String callErrorMessage(String messageId, ErrorCode errorCode, String errorDesc, String details){
        JSONArray retJson = new JSONArray();
        retJson.put(MessageType.CALL_ERROR.getTypeNumber());        //message type id
        retJson.put(messageId);                                     //message id
        retJson.put(errorCode.name());                              //error code
        retJson.put(errorDesc);                                     //error desc
        retJson.put(details);                                       //details
        return retJson.toString();
    }
}
