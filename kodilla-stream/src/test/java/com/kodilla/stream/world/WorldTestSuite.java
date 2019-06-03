
package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {

        //Given
        List<Country>countriesInEurope = new ArrayList<>();
        List<Country>countriesInAsia = new ArrayList<>();
        List<Country>countriesInAfrica = new ArrayList<>();
        List<Continent> continents = new ArrayList<>();

        countriesInEurope.add(new Country("Poland", new BigDecimal (38476269)));
        countriesInEurope.add(new Country("Germany", new BigDecimal (80594017)));
        countriesInEurope.add(new Country("Italy", new BigDecimal (62137802)));

        countriesInAsia.add(new Country("China", new BigDecimal (1379302771)));
        countriesInAsia.add(new Country("Japan", new BigDecimal (1281935911)));
        countriesInAsia.add(new Country("India", new BigDecimal (126451398)));

        countriesInAfrica.add(new Country("Federal Republic of Nigeria", new BigDecimal (190632261)));
        countriesInAfrica.add(new Country("Ethiopia", new BigDecimal (105350020)));
        countriesInAfrica.add(new Country("Republic of Kenya", new BigDecimal (47615739)));

        continents.add(new Continent("Europe", countriesInEurope));
        continents.add(new Continent("Asia", countriesInAsia));
        continents.add(new Continent("Africa", countriesInAfrica));

        World world = new World(continents);

        //When
        BigDecimal worldPeoples = world.getPeopleQuantity();

        //Then
        Assert.assertEquals(worldPeoples, new BigDecimal("3312496188"));
    }
}

