package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTestSuite{

    @Test
    public void testZeroPosts(){
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(5);
        List<String> usersName=new ArrayList<String>();
        for(int n = 0; n < 3; n++){
            usersName.add("a");}
        when(statisticsMock.usersNames()).thenReturn(usersName);
        AdvStatistics advStatistics = new AdvStatistics();

        //When
        advStatistics.calculateAdvStatistics(statisticsMock);
        int postsCountTest=advStatistics.getPostsCount();
        int commentsCountTest=advStatistics.getCommentsCount();
        int usersNamesTest=advStatistics.getUsersNames();
        double postPerUserTest=advStatistics.getPostsPerUser();
        double commentsPerUserTest = advStatistics.getCommentsPerUser();
        double commentsPerPostTest=advStatistics.getCommentsPerPost();

        //Then
        Assert.assertEquals(0,postsCountTest);
        Assert.assertEquals(5,commentsCountTest);
        Assert.assertEquals(3,usersNamesTest);
        Assert.assertEquals(0.0,0,postPerUserTest);
        Assert.assertEquals(0.0,0,commentsPerUserTest);
        Assert.assertEquals(0.0,0,commentsPerPostTest);

    }
    @Test
    public void testThousandPosts(){
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(100);
        List<String> usersName=new ArrayList<String>();
        for(int n = 0; n < 50; n++){
            usersName.add("a");}
        when(statisticsMock.usersNames()).thenReturn(usersName);
        AdvStatistics advStatistics = new AdvStatistics();

        //When
        advStatistics.calculateAdvStatistics(statisticsMock);
        int postsCountTest=advStatistics.getPostsCount();
        int commentsCountTest=advStatistics.getCommentsCount();
        int usersNamesTest=advStatistics.getUsersNames();
        double postPerUserTest=advStatistics.getPostsPerUser();
        double commentsPerUserTest = advStatistics.getCommentsPerUser();
        double commentsPerPostTest=advStatistics.getCommentsPerPost();

        //Then
        Assert.assertEquals(1000,postsCountTest);
        Assert.assertEquals(100,commentsCountTest);
        Assert.assertEquals(50,usersNamesTest);
        Assert.assertEquals(20.0,0.0,postPerUserTest);
        Assert.assertEquals(2.0,0.0,commentsPerUserTest);
        Assert.assertEquals(0.1,0.0,commentsPerPostTest);

    }
    @Test
    public void testCommentsCount() {
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(0);
        List<String> usersName = new ArrayList<String>();
        for (int n = 0; n < 50; n++) {
            usersName.add("a");
        }
        when(statisticsMock.usersNames()).thenReturn(usersName);
        AdvStatistics advStatistics = new AdvStatistics();

        //When
        advStatistics.calculateAdvStatistics(statisticsMock);
        int postsCountTest = advStatistics.getPostsCount();
        int commentsCountTest = advStatistics.getCommentsCount();
        int usersNamesTest = advStatistics.getUsersNames();
        double postPerUserTest = advStatistics.getPostsPerUser();
        double commentsPerUserTest = advStatistics.getCommentsPerUser();
        double commentsPerPostTest = advStatistics.getCommentsPerPost();

        //Then
        Assert.assertEquals(1000, postsCountTest);
        Assert.assertEquals(0, commentsCountTest);
        Assert.assertEquals(50, usersNamesTest);
        Assert.assertEquals(20.0, 0, postPerUserTest);
        Assert.assertEquals(0.0, 0, commentsPerUserTest);
        Assert.assertEquals(0.0, 0, commentsPerPostTest);
    }
    @Test
    public void testCommentsLowerPosts(){
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn(5);
        when(statisticsMock.postsCount()).thenReturn(10);
        List<String> usersName = new ArrayList<String>();
        for (int n = 0; n < 5; n++) {
            usersName.add("a");
        }
        when(statisticsMock.usersNames()).thenReturn(usersName);
        AdvStatistics advStatistics = new AdvStatistics();
        //When
        advStatistics.calculateAdvStatistics(statisticsMock);
        int postsCountTest = advStatistics.getPostsCount();
        int commentsCountTest = advStatistics.getCommentsCount();
        int usersNamesTest = advStatistics.getUsersNames();
        double postPerUserTest = advStatistics.getPostsPerUser();
        double commentsPerUserTest = advStatistics.getCommentsPerUser();
        double commentsPerPostTest = advStatistics.getCommentsPerPost();

        //Then
        Assert.assertTrue(postsCountTest-commentsCountTest>0);
        Assert.assertEquals(10, postsCountTest);
        Assert.assertEquals(5, commentsCountTest);
        Assert.assertEquals(5, usersNamesTest);
        Assert.assertEquals(2.0, 0.0, postPerUserTest);
        Assert.assertEquals(1.0, 0.0, commentsPerUserTest);
        Assert.assertEquals(0.5, 0.0, commentsPerPostTest);
    }
    @Test
    public void testCommentsHigherPosts(){
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn(10);
        when(statisticsMock.postsCount()).thenReturn(5);
        List<String> usersName = new ArrayList<String>();
        for (int n = 0; n < 5; n++) {
            usersName.add("a");
        }
        when(statisticsMock.usersNames()).thenReturn(usersName);
        AdvStatistics advStatistics = new AdvStatistics();
        //When
        advStatistics.calculateAdvStatistics(statisticsMock);
        int postsCountTest = advStatistics.getPostsCount();
        int commentsCountTest = advStatistics.getCommentsCount();
        int usersNamesTest = advStatistics.getUsersNames();
        double postPerUserTest = advStatistics.getPostsPerUser();
        double commentsPerUserTest = advStatistics.getCommentsPerUser();
        double commentsPerPostTest = advStatistics.getCommentsPerPost();

        //Then
        Assert.assertTrue(postsCountTest-commentsCountTest>0);
        Assert.assertEquals(5, postsCountTest);
        Assert.assertEquals(10, commentsCountTest);
        Assert.assertEquals(5, usersNamesTest);
        Assert.assertEquals(1.0, 0.0, postPerUserTest);
        Assert.assertEquals(2.0, 0.0, commentsPerUserTest);
        Assert.assertEquals(2.0, 0.0, commentsPerPostTest);
        Assert.assertTrue(commentsCountTest-postsCountTest>0);
    }
    @Test
    public void testNumberOfUsersZero(){
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(100);
        List<String> usersName = new ArrayList<String>();

        when(statisticsMock.usersNames()).thenReturn(usersName);
        AdvStatistics advStatistics = new AdvStatistics();

        //When
        advStatistics.calculateAdvStatistics(statisticsMock);
        int postsCountTest = advStatistics.getPostsCount();
        int commentsCountTest = advStatistics.getCommentsCount();
        int usersNamesTest = advStatistics.getUsersNames();
        double postPerUserTest = advStatistics.getPostsPerUser();
        double commentsPerUserTest = advStatistics.getCommentsPerUser();
        double commentsPerPostTest = advStatistics.getCommentsPerPost();

        //Then
        Assert.assertEquals(1000, postsCountTest);
        Assert.assertEquals(100, commentsCountTest);
        Assert.assertEquals(0, usersNamesTest);
        Assert.assertEquals(0.0, 0, postPerUserTest);
        Assert.assertEquals(0.0, 0, commentsPerUserTest);
        Assert.assertEquals(0.0, 0, commentsPerPostTest);
    }
    @Test
    public void testNumberOfUsersHundred(){
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(100);
        List<String> usersName = new ArrayList<String>();
        for (int n = 0; n < 100; n++) {
            usersName.add("a");
        }
        when(statisticsMock.usersNames()).thenReturn(usersName);
        AdvStatistics advStatistics = new AdvStatistics();

        //When
        advStatistics.calculateAdvStatistics(statisticsMock);
        int postsCountTest = advStatistics.getPostsCount();
        int commentsCountTest = advStatistics.getCommentsCount();
        int usersNamesTest = advStatistics.getUsersNames();
        double postPerUserTest = advStatistics.getPostsPerUser();
        double commentsPerUserTest = advStatistics.getCommentsPerUser();
        double commentsPerPostTest = advStatistics.getCommentsPerPost();

        //Then
        Assert.assertEquals(1000, postsCountTest);
        Assert.assertEquals(100, commentsCountTest);
        Assert.assertEquals(100, usersNamesTest);
        Assert.assertEquals(10.0, 0, postPerUserTest);
        Assert.assertEquals(1.0, 0, commentsPerUserTest);
        Assert.assertEquals(0.1, 0, commentsPerPostTest);
    }
}

