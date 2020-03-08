package com.kodilla.testing.shape;

import com.kodilla.testing.shape.Shape;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.*;
import java.util.ArrayList;


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

        ArrayList<Shape> results = shapeCollector.addFigure(triangle);
        //Then
        Assert.assertEquals(1,results.size());
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
        ArrayList<Shape> results = shapeCollector.removeFigure(triangle);
        //Then
        Assert.assertEquals(0,results.size());
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

        Shape result = shapeCollector.getFigure(2);
        //Then
        Assert.assertEquals(circle,result);
    }
}

