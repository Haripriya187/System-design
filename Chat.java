package com.chatapp.models;

import java.util.ArrayList;
import java.util.List;

public abstract class Chat {

    protected String chatId;
    protected List<User> participants;
    protected List<Message> messages;

    public Chat(String chatId) {
        this.chatId = chatId;
        this.participants = new ArrayList<>();
        this.messages = new ArrayList<>();
    }

    public abstract void sendMessage(Message message);
}
