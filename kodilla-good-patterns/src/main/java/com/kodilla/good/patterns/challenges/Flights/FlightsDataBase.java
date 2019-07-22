package com.kodilla.good.patterns.challenges.Flights;

import java.util.ArrayList;
import java.util.List;

public class FlightsDataBase {

    List<Flight> flights = new ArrayList();

    public List<Flight> getFlights() {

        flights.add(new Flight("Kraków","Berlin","Wrocław"));
        flights.add(new Flight("Kraków","Gdańsk",""));
        flights.add(new Flight("Katowice","Rzym",""));
        flights.add(new Flight("Katowice","Barcelona","Berlin"));
        flights.add(new Flight("Kraków","Honkong","Paryż"));
        flights.add(new Flight("Gdańsk","Oslo",""));
        flights.add(new Flight("Paryż","Moskwa","Warszawa"));
        flights.add(new Flight("Berlin","Paryż",""));
        flights.add(new Flight("Honkong","Warszawa","Oslo"));

        return flights;
    }
}
