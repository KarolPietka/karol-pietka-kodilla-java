package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FindFlight {
    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flightDestination = new HashMap<>();
        flightDestination.put("Kraków", true);
        flightDestination.put("Katowice", true);
        flightDestination.put("Zakopane", false);
        flightDestination.put("Olkusz", false);

        for (Map.Entry<String, Boolean> entry : flightDestination.entrySet()) {
            if (entry.getKey().equals(flight.getArrivalAirport())) {
                if (entry.getValue()) {
                    System.out.println("Fly to " + entry.getKey() + " is available.");
                } else {
                    throw new RouteNotFoundException();
                }
            }
        }
    }
}









