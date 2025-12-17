package com.chatapp.services;

import com.chatapp.models.Message;

public class MessageService {

    public void saveMessage(Message message) {
        // Future DB logic
        System.out.println("Message saved: " + message.getContent());
    }
}
