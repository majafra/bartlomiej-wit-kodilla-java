package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    int identifier;
    String login;
    char sex;
    LocalDate birthDate;
    int numberOfPosts;

    public ForumUser(Integer identifier, String login,int yearOfBirth, int monthOfBirth, int dayOfBirth, char sex, int numberOfPosts) {
        this.identifier = identifier;
        this.login = login;
        this.sex = sex;
        this.birthDate = LocalDate.of( yearOfBirth,  monthOfBirth, dayOfBirth);
        this.numberOfPosts = numberOfPosts;
    }

    public Integer getIdentifier() {
        return identifier;
    }

    public String getLogin() {
        return login;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }
}