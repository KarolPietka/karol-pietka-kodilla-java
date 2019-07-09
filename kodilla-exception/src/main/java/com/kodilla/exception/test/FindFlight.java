package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FindFlight {
    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flightDestination = new HashMap<>();
        flightDestination.put("Kraków", true);
        flightDestination.put("Katowice", true);
        flightDestination.put("Zakopane", false);
        flightDestination.put("Olkusz", false);

        if (flightDestination.get(flight.getArrivalAirport())) {
            System.out.println("Fly is available");
            return flightDestination.get(flight.getDepartureAirport());
        } else {
            throw new RouteNotFoundException();
        }
    }
}








