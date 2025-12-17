package com.chatapp.services;

import com.chatapp.models.Message;
import com.chatapp.models.User;

public class NotificationService {

    public void notifyUser(User user, Message message) {
        System.out.println("Notification sent to " + user.getName());
    }
}
