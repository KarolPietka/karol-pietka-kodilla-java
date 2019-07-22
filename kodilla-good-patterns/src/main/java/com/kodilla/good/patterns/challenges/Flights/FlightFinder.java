package com.kodilla.good.patterns.challenges.Flights;

import java.util.List;
import java.util.stream.Collectors;

public class FlightFinder {

    public final FlightsDataBase flightsDataBase;

    public FlightFinder(final FlightsDataBase flightsDataBase) {
       this.flightsDataBase = flightsDataBase;
    }


    public List<Flight> flightFrom(String city) {
        List<Flight> flightFrom = flightsDataBase.getFlights().stream()
                .filter(r -> r.getFlightFrom().equals(city))
                .collect(Collectors.toList());

        return flightFrom;
    }

    public List<Flight> flightTo(String city) {
        List<Flight> flightTo = flightsDataBase.getFlights().stream()
                .filter(r -> r.getFlightTo().equals(city))
                .collect(Collectors.toList());

        return flightTo;
    }

    public List<Flight> flightThrough(String city) {
        List<Flight> flightThrough = flightsDataBase.getFlights().stream()
                .filter(r -> r.getFlightThrough().equals(city))
                .collect(Collectors.toList());

        return flightThrough;
    }


    public  void result(String chooseOption, String city) {
        if (chooseOption.equals("From")) {
            // System.out.println(flightFrom(city))

        } else if (chooseOption.equals("To")) {
            System.out.println(flightTo(city));
        } else if (chooseOption.equals("Trough")) {
            System.out.println(flightThrough(city));
        }

    }
}
