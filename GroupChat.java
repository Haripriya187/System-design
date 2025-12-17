package com.chatapp.models;

public class GroupChat extends Chat {

    private User admin;

    public GroupChat(String chatId, User admin) {
        super(chatId);
        this.admin = admin;
        participants.add(admin);
    }

    public void addUser(User user) {
        participants.add(user);
    }

    @Override
    public void sendMessage(Message message) {
        messages.add(message);
        System.out.println("[Group] " + message.getSender().getName() + ": " + message.getContent());
    }
}
