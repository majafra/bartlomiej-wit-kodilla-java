package com.kodilla.patterns.social;

public class User {

    private String name;
    protected SocialPublisher socialPublisher;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String showShare() {
        return socialPublisher.share();
    }

    public void setSharing(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }
}

