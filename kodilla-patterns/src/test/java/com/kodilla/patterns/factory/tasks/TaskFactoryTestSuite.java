package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testShoppingTask() {
        //Given
        TaskFactory task = new TaskFactory();
        //When
        Task shopping = task.makeTask(TaskFactory.SHOPPING);
        //Then
        Assert.assertEquals("Shopping",shopping.getTaskName());
    }

    @Test
    public void testDrivingTask() {
        //Given
        TaskFactory task = new TaskFactory();
        //When
        Task driving = task.makeTask(TaskFactory.DRIVING);
        //Then
        Assert.assertEquals("Driving",driving.getTaskName());
    }

    @Test
    public void testPaintingTask() {
        //Given
        TaskFactory task = new TaskFactory();
        //When
        Task painting = task.makeTask(TaskFactory.PAINTING);
        //Then
        Assert.assertEquals("Painting",painting.getTaskName());
    }
}