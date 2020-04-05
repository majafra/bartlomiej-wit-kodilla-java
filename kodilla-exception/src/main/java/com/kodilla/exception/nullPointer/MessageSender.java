package com.kodilla.exception.nullPointer;

public class MessageSender {
    public void sendMessageTo(User user, String message) {
        if(user != null) {
            System.out.println("Sending message: " + message + " to: " + user.getName());
        }
    }
}
