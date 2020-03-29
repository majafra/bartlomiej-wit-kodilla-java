package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {

    List<Continent> listOfContinents = new ArrayList<>();

    public void addContinent(Continent countries) {
        listOfContinents.add(countries);
    }


    public BigDecimal getPeopleQuantity(){
        return listOfContinents.stream()
                .flatMap(listOfContinents -> listOfContinents.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}

