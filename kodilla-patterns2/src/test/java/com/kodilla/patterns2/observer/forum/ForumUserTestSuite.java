package com.kodilla.patterns2.observer.forum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ForumUserTestSuite {
    @Test
            public void testUpdate() {
        // Given
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic javaToolsForum = new JavaToolsForumTopic();
        ForumUser johnSmith = new ForumUser("John Smith");
        ForumUser ivoneEscobar = new ForumUser("Ivone Escobar");
        ForumUser jessiePinkman = new ForumUser("Jessie Pinkman");
        javaHelpForum.registerObserver(johnSmith);
        javaHelpForum.registerObserver(jessiePinkman);
        javaToolsForum.registerObserver(ivoneEscobar);
        javaToolsForum.registerObserver(jessiePinkman);
        //When
        javaHelpForum.addPost("Hi,could you help?");
        javaHelpForum.addPost("Better try...");
        javaHelpForum.addPost("Help pls");
        javaToolsForum.addPost("Why while?");
        javaToolsForum.addPost("When I try...");
        //Then
        assertEquals(3,johnSmith.getUpdateCount());
        assertEquals(3,ivoneEscobar.getUpdateCount());
        assertEquals(3,jessiePinkman.getUpdateCount());
    }
}
