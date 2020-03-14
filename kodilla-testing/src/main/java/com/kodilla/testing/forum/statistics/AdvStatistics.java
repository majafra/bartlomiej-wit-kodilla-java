package com.kodilla.testing.forum.statistics;

import java.util.List;

public class AdvStatistics {

    int postsCount;
    int commentsCount;
    int usersNames;
    double postsPerUser;
    double commentsPerUser;
    double commentsPerPost;

    public void calculateAdvStatistics(Statistics statistics) {

        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();
        usersNames = statistics.usersNames().size();

        if (usersNames !=0) {
            postsPerUser = postsCount / (double)usersNames;
        }else{
            System.out.println("Brak uczestników forum");
            postsPerUser=0.0;
        }
        if (usersNames !=0) {
            commentsPerUser = commentsCount /(double) usersNames;
        }else{
            System.out.println("Brak uczestników forum");
            commentsPerUser=0.0;
        }
        if (postsCount !=0) {
            commentsPerPost = commentsCount /(double) postsCount;
        }else{
            System.out.println("Brak postów");
            commentsPerPost=0.0;
        }
    }
    public int getPostsCount() {
        return postsCount;
    }
    public int getCommentsCount() {
        return commentsCount;
    }
    public int getUsersNames() {
        return usersNames;
    }
    public double getPostsPerUser() {
        return postsPerUser;
    }
    public double getCommentsPerUser() {
        return commentsPerUser;
    }
    public double getCommentsPerPost() {
        return commentsPerPost;
    }

    public void showStatistics(){
        System.out.println(getPostsCount());
        System.out.println(getCommentsCount());
        System.out.println(getUsersNames());
        System.out.println(getPostsPerUser());
        System.out.println(getCommentsPerUser());
        System.out.println(getCommentsPerPost());
    }
}






