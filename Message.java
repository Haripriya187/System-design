package com.chatapp.models;

import java.time.LocalDateTime;

public abstract class Message {

    protected String messageId;
    protected User sender;
    protected LocalDateTime timestamp;
    protected MessageStatus status;

    public Message(String messageId, User sender) {
        this.messageId = messageId;
        this.sender = sender;
        this.timestamp = LocalDateTime.now();
        this.status = MessageStatus.SENT;
    }

    public abstract String getContent();

    public User getSender() {
        return sender;
    }
}
