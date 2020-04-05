package com.kodilla.exception.nullPointer;

public class NullPointerExceptionRunner {
    public static void main(String[] args) {
        User user = null;

        MessageSender messageSender = new MessageSender();
        messageSender.sendMessageTo(user, "Hello!");

    }
}
