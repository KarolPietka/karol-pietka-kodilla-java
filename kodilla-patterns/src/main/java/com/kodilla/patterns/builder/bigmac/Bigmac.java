package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public final class Bigmac {
    private final String bun;
    private final int burgers;
    private final String sauce;
    private final List<String> ingredients;

    public Bigmac(final String bun, int burgers, final String sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public static class BigmacBuilder {
        private String bun;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();
        public static final String WITH_SESAME = "with sesame";
        public static final String WITHOUT_SESAME = "without sesame";
        public static final String STANDARD_SAUCE = "standard sauce";
        public static final String BARBECUE_SAUCE = "barbecue sauce";
        public static final String SAUCE_OF_1000_ISLANDS = "1000 islands sauce";

        public BigmacBuilder bun(String bun) {
            if (bun.equalsIgnoreCase(WITH_SESAME) || bun.equalsIgnoreCase(WITHOUT_SESAME)){
                this.bun = bun;
            }else {
                throw new IllegalStateException("Please choose bun. We have bun with sesame or without sesame.");
            }
            return this;
        }

        public BigmacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce(String sauce) {
            if (sauce.equals(STANDARD_SAUCE) || sauce.equals(BARBECUE_SAUCE) || sauce.equals(SAUCE_OF_1000_ISLANDS)) {
                this.sauce = sauce;
            } else {
                throw new IllegalStateException("Choose from available sauces: standard sauce or barbecue sauce or sauce of 1000 islands. ");
           }
            return this;
        }

        public BigmacBuilder ingredient(String ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            if (bun != null){
               this.bun = bun;
            }else {
                throw new IllegalStateException("Take bun.");
            }

            if (burgers != 0){
               this.burgers = burgers;
            }else{
                throw new IllegalStateException("Take meal.");
            }

            if (sauce != null) {
                this.sauce = sauce;
            } else {
                throw new IllegalStateException("Choose one of available sauce.");
            }

            return new Bigmac(bun, burgers, sauce, ingredients);
        }

    }

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
        return "BigmacBuilder{" +
                "bun = '" + bun + '\'' +
                ", burgers = " + burgers +
                ", sauce = '" + sauce + '\'' +
                ", ingredients = " + ingredients +
                '}';
    }
}