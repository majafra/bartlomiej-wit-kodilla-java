package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testBurgerNew() {
        //Given
        BigMac burger = new BigMac.BurgerBuilder()
                .bun("Sezam")
                .burgers(1)
                .sauce("Standard")
                .ingredient("lettuce")
                .ingredient("Chilli")
                .ingredient("Onion")
                .ingredient("Cheese")
                .build();
        System.out.println(burger);
        //When
        int howManyIngredients = burger.getIngredients().size();
        //Then
        Assert.assertEquals(4, howManyIngredients);
    }
}

