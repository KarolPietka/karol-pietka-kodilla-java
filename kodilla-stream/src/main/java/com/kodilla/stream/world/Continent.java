package com.kodilla.stream.world;

import java.util.List;

public class Continent {
    private String name;
    private final List<Country> countries;

    public Continent(final String name, final List<Country>countries) {
        this.name = name;
        this.countries = countries;
    }
    public String getName() {
        return name;
    }
    public List<Country> getCountries() {
        return countries;
    }
}
