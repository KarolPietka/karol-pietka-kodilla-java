package com.kodilla.good.patterns.challenges.Flights;

public class Application {
    public static void main (String []arg){

        FlightsDataBase flightsDataBase = new FlightsDataBase();

        FlightFinder flightFinder = new FlightFinder(flightsDataBase);
        flightFinder.findAirport("To","Berlin");

    }
}
