package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public abstract class AbstractPizzaOrderDecorator implements PizzaOrder {
    public final PizzaOrder pizza;

    protected AbstractPizzaOrderDecorator(PizzaOrder pizza){
        this.pizza = pizza;
    }
    @Override
    public BigDecimal getCost(){
        return pizza.getCost();
    }

    @Override
    public String getDescription(){
        return pizza.getDescription();
    }
}