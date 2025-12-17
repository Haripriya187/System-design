package com.chatapp.models;

public class OneToOneChat extends Chat {

    public OneToOneChat(String chatId, User user1, User user2) {
        super(chatId);
        participants.add(user1);
        participants.add(user2);
    }

    @Override
    public void sendMessage(Message message) {
        messages.add(message);
        System.out.println(message.getSender().getName() + ": " + message.getContent());
    }
}
