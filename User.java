package com.chatapp.models;

public class User {

    private String userId;
    private String name;
    private UserStatus status;

    public User(String userId, String name) {
        this.userId = userId;
        this.name = name;
        this.status = UserStatus.ONLINE;
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public UserStatus getStatus() {
        return status;
    }

    public void setStatus(UserStatus status) {
        this.status = status;
    }
}
