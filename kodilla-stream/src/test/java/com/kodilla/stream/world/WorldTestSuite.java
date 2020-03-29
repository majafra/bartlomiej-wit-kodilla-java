package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test

    public void testGetPeopleQuantity() {
//Given


        Country poland = new Country("Poland", new BigDecimal("38000000"));
        Country germany= new Country("Germany", new BigDecimal("38000000"));
        Country australia= new Country("Australia", new BigDecimal("38000000"));
        Country usa= new Country("USA", new BigDecimal("38000000"));
        Country canada= new Country("Canada", new BigDecimal("38000000"));
        Country mongolia= new Country("Mongolia", new BigDecimal("38000000"));
        Country china= new Country("China", new BigDecimal("38000000"));

        Continent europe = new Continent("Europe");
        Continent australiaAndOceania = new Continent("AustraliaAndOceania");
        Continent northAmerica = new Continent("NorthAmerica");
        Continent asia = new Continent("Asia");

        World world = new World();
        world.addContinent(europe);
        world.addContinent(australiaAndOceania);
        world.addContinent(northAmerica);
        world.addContinent(asia);

        europe.addCountry(poland);
        europe.addCountry(germany);
        australiaAndOceania.addCountry(australia);
        northAmerica.addCountry(usa);
        northAmerica.addCountry(canada);
        asia.addCountry(mongolia);
        asia.addCountry(china);
        //When
        BigDecimal expectedQuantity = new BigDecimal("266000000");
        BigDecimal result= world.getPeopleQuantity();
        //Then
        Assert.assertEquals(expectedQuantity, result);
    }
}

