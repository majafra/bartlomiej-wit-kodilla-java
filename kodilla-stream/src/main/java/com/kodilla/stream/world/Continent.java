package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Continent {

    private String nameOfContinent;
    private List<Country> countries  = new ArrayList<Country>();

    public Continent(String nameOfContinent) {
        this.nameOfContinent = nameOfContinent;
    }

    public List<Country> getCountries() {
        return countries;
    }

    public String getNameOfContinent() {
        return nameOfContinent;
    }

    public void addCountry(Country country) {
        countries.add(country);
    }
}

