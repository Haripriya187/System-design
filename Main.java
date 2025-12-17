package com.chatapp;

import com.chatapp.models.*;
import com.chatapp.services.ChatManager;

public class Main {

    public static void main(String[] args) {

        User alice = new User("U1", "Alice");
        User bob = new User("U2", "Bob");

        ChatManager chatManager = ChatManager.getInstance();

        Chat chat = chatManager.createOneToOneChat(alice, bob);

        chatManager.sendMessage(chat, alice, "Hi Bob!");
        chatManager.sendMessage(chat, bob, "Hello Alice!");
    }
}
