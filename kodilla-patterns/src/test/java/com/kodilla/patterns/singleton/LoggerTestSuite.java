package com.kodilla.patterns.singleton;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    private static Logger logger;

    @BeforeClass
    public static void logging() {
        Logger.getInstance().log("Proba");
        Logger.getInstance().log("Proba1");
        Logger.getInstance().log("Proba2");
    }

    @AfterClass
    public static void getLog() {
        Logger.getInstance().getLastLog();
    }

    @Test
    public void testGetLog() {
        //Given
        //When
        String result = Logger.getInstance().getLastLog();
        System.out.println("Opened: " + result);
        //Then
        Assert.assertEquals("Proba2", result);
    }
}
