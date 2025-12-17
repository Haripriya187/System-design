package com.chatapp.services;

import com.chatapp.factory.MessageFactory;
import com.chatapp.models.*;
import com.chatapp.utils.IdGenerator;

public class ChatManager {

    private static ChatManager instance;

    private ChatManager() {}

    public static ChatManager getInstance() {
        if (instance == null) {
            instance = new ChatManager();
        }
        return instance;
    }

    public Chat createOneToOneChat(User u1, User u2) {
        return new OneToOneChat(IdGenerator.generateId(), u1, u2);
    }

    public void sendMessage(Chat chat, User sender, String text) {
        Message message = MessageFactory.createTextMessage(sender, text);
        chat.sendMessage(message);
    }
}
