package com.kodilla.testing.shape;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.*;
import java.util.ArrayList;


public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        Shape circle = new Circle(3.0);
        Shape triangle = new Triangle(2.0,2.0);
        Shape square = new Square (2.0);

        shapeCollector.addFigure(triangle);
        int result=shapeCollector.checkSize();
        //Then
        Assert.assertEquals(1,result);
    }
    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        Shape circle = new Circle(3.0);
        Shape triangle = new Triangle(2.0,2.0);
        Shape square = new Square (2.0);

        shapeCollector.addFigure(triangle);
        shapeCollector.removeFigure(triangle);
        int result=shapeCollector.checkSize();

        //Then
        Assert.assertEquals(0,result);
    }
    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        Shape circle = new Circle(3.0);
        Shape triangle = new Triangle(2.0,2.0);
        Shape square = new Square (2.0);

        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);

        Shape result = shapeCollector.getFigure(1);
        //Then
        Assert.assertEquals(circle,result);
    }
}

