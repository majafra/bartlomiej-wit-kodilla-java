package com.kodilla.patterns.social;

import com.kodilla.patterns.social.publishers.SnapchatPublisher;

public class ZGeneration extends User {

    public ZGeneration(String name) {
        super(name);
        this.socialPublisher= new SnapchatPublisher();

    }
}
