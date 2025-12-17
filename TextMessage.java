package com.chatapp.models;

public class TextMessage extends Message {

    private String text;

    public TextMessage(String messageId, User sender, String text) {
        super(messageId, sender);
        this.text = text;
    }

    @Override
    public String getContent() {
        return text;
    }
}
