package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

import static javafx.scene.input.KeyCode.M;

public final class Forum {
    public static List<ForumUser> getUserList() {
        final List<ForumUser> theList = new ArrayList<>();
        theList.add(new ForumUser(1,"John",1991,11,10,'M',3));
        theList.add(new ForumUser(2,"Dora",1981,10,10,'F',3));

        return new ArrayList<ForumUser>(theList);
    }
}

