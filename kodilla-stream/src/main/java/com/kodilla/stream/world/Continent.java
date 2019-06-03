package com.kodilla.stream.world;

import java.util.List;

public class Continent {
    private String continentName;
    private final List<Country> countryList;

    public Continent(final String continentName, final List<Country>countryList) {
        this.continentName = continentName;
        this.countryList = countryList;
    }
    public String getContinentName() {
        return continentName;
    }
    public List<Country> getCountryList() {
        return countryList;
    }
}
