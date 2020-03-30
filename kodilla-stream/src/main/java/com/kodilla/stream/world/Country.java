package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {

    private String land;
    private BigDecimal peopleQuantity;

    public Country(String land, BigDecimal peopleQuantity) {
        this.land = land;
        this.peopleQuantity = peopleQuantity;
    }
    public String getLand() {
        return land;
    }
    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }
}
