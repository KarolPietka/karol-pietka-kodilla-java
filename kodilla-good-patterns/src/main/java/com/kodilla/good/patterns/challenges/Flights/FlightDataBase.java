package com.kodilla.good.patterns.challenges.Flights;

import java.util.HashMap;
import java.util.Map;

public class FlightDataBase {

    Map<Integer, Flight> flightDataBase = new HashMap<>();

    public void setFlightDataBase () {

        flightDataBase.put(0, new Flight("Kraków", "Berlin", "Wrocław"));
        flightDataBase.put(1, new Flight("Kraków", "Gdańsk", ""));
        flightDataBase.put(2, new Flight("Katowice", "Rzym", ""));
        flightDataBase.put(3, new Flight("Katowice", "Barcelona", "Berlin"));
        flightDataBase.put(4, new Flight("Kraków", "Honkong", "Paryż"));
        flightDataBase.put(5, new Flight("Gdańsk", "Oslo", ""));
        flightDataBase.put(6, new Flight("Paryż", "Moskwa", "Warszawa"));
        flightDataBase.put(7, new Flight("Berlin", "Paryż", ""));
        flightDataBase.put(8, new Flight("Honkong", "Warszawa", "Oslo"));
        flightDataBase.put(9, new Flight("Honkong", "Berlin", "Kraków"));
        flightDataBase.put(10, new Flight("Gdańsk", "Paryż", "Katowice"));
    }

    public Map<Integer, Flight> getFlightDataBase() {
        return flightDataBase;
    }
}
