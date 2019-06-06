package com.kodilla.stream.world;

import java.util.List;

public class Continent {
    private String name;
    private final List<Country> country;

    public Continent(final String name, final List<Country>country) {
        this.name = name;
        this.country = country;
    }
    public String getName() {
        return name;
    }
    public List<Country> getCountry() {
        return country;
    }
}
