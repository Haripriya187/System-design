package com.chatapp.factory;

import com.chatapp.models.TextMessage;
import com.chatapp.models.User;
import com.chatapp.utils.IdGenerator;

public class MessageFactory {

    public static TextMessage createTextMessage(User sender, String text) {
        return new TextMessage(IdGenerator.generateId(), sender, text);
    }
}
