package com.kodilla.patterns2.decorator.pizza;

import com.kodilla.patterns2.decorator.taxiportal.*;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testPizzaOrderWithOnionGetCost() {
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        thePizza = new ExtraOnionPizzaOrderDecorator(thePizza);
        //When
        BigDecimal theCost = thePizza.getCost();
        //Then
        assertEquals(new BigDecimal(17), theCost);
    }

    @Test
    public void testPizzaOrderWithOnionGetDescription() {
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        thePizza = new ExtraOnionPizzaOrderDecorator(thePizza);
        //When
        String description = thePizza.getDescription();
        //Then
        assertEquals("Regular Pizza plus Onion", description);
    }

    @Test
    public void testPizzaOrderWithOnionAndSalamiGetCost() {
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        thePizza = new ExtraOnionPizzaOrderDecorator(thePizza);
        thePizza = new ExtraSalamiPizzaOrderDecorator(thePizza);
        //When
        BigDecimal theCost = thePizza.getCost();
        //Then
        assertEquals(new BigDecimal(20), theCost);
    }

    @Test
    public void testPizzaOrderWithOnionAndSalamiGetDescription() {
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        thePizza = new ExtraOnionPizzaOrderDecorator(thePizza);
        thePizza = new ExtraSalamiPizzaOrderDecorator(thePizza);
        //When
        String description = thePizza.getDescription();
        //Then
        assertEquals("Regular Pizza plus Onion plus Salami", description);
    }

    @Test
    public void testPizzaOrderWithSalamiAndExtraCheeseGetCost() {
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        thePizza = new ExtraSalamiPizzaOrderDecorator(thePizza);
        thePizza = new ExtraCheesePizzaOrderDecorator(thePizza);
        //When
        BigDecimal theCost = thePizza.getCost();
        //Then
        assertEquals(new BigDecimal(22), theCost);
    }

    @Test
    public void testPizzaOrderWithSalamiAndExtraCheeseGetDescription() {
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        thePizza = new ExtraSalamiPizzaOrderDecorator(thePizza);
        thePizza = new ExtraCheesePizzaOrderDecorator(thePizza);
        //When
        String description = thePizza.getDescription();
        //Then
        assertEquals("Regular Pizza plus Salami plus ExtraCheese", description);
    }
}

