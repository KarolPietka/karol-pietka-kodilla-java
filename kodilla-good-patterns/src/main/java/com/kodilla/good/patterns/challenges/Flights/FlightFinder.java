package com.kodilla.good.patterns.challenges.Flights;

import java.util.stream.Collectors;

public class FlightFinder {

    public static void departure(String flightFrom, FlightDataBase flightDataBase) {
        flightDataBase.getFlightDataBase().entrySet().stream()
                .filter(map -> map.getValue().getFlightFrom().equals(flightFrom))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    public static void arrival (String flightTo, FlightDataBase flightDataBase) {
        flightDataBase.getFlightDataBase().entrySet().stream()
                .filter(map -> map.getValue().getFlightTo().equals(flightTo))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    public static void transfer (String flightThrough, FlightDataBase flightDataBase){
        flightDataBase.getFlightDataBase().entrySet().stream()
                .filter(m -> m.getValue().getFlightThrough().equals(flightThrough))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
