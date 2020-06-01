package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class BigMac {
    private final String bun;
    private final int burgers;
    private final String sauce;
    private List<String> ingredients;

    public static class BurgerBuilder {

        private String bun;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BurgerBuilder bun(String bun) {
            this.bun = bun;
            return this;
        }
        public BurgerBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }
        public BurgerBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }
        public BurgerBuilder ingredient(String ingredient) {
            ingredients.add(ingredient);
            return this;
        }
        public BigMac build() {
            return new BigMac(bun, burgers, sauce, ingredients);
        }
    }
        public BigMac(String bun, int burgers, String sauce, List<String> ingredients) {
            this.bun = bun;
            this.burgers = burgers;
            this.sauce = sauce;
            this.ingredients = new ArrayList<>(ingredients);};

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "bottom='" + bun + '\'' +
                ", sauce='" + sauce + '\'' +
                ", burgers='" + burgers + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
