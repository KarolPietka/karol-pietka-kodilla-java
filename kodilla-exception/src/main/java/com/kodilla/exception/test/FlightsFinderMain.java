package com.kodilla.exception.test;

public class FlightsFinderMain {
    public static void main(String[]args) {

        Flight flight = new Flight("Katowice", "Kraków");
        Flight flight1 = new Flight("Kraków", "Olkusz");

        FindFlight findFlight = new FindFlight();

        try {
            findFlight.findFlight(flight);
        } catch (RouteNotFoundException e) {
            System.out.println("System can not find arrival airport.");
        } finally {
            System.out.println("Thank You for using our flights finder.");
        }

        try {
            findFlight.findFlight(flight1);
        } catch (RouteNotFoundException e) {
            System.out.println("System can not find arrival airport. Please choose another one." );
        } finally {
            System.out.println("Thank You for using our flights finder.");
        }
    }
}
