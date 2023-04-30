package com.example.easychatgpt;

public class Message {
    public static String SEN_BY_ME = "me";
    public static String SEN_BY_Bot = "bot";

    String message;
    String sendBy;

    public Message(String message, String sendBy) {
        this.message = message;
        this.sendBy = sendBy;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSendBy() {
        return sendBy;
    }

    public void setSendBy(String sendBy) {
        this.sendBy = sendBy;
    }
}
