package com.kodilla.patterns.social.publishers;

import com.kodilla.patterns.social.SocialPublisher;

public class SnapchatPublisher implements SocialPublisher {

    public String share() {
        return "Snapchat";
    }
}