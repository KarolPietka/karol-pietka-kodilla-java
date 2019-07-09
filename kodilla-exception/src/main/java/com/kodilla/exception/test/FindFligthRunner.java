package com.kodilla.exception.test;

public class FindFligthRunner {
    public static void main(String[]args) {

        Flight flight = new Flight("Kraków", "Katowice");
        Flight flight1 = new Flight("Olkusz", "Zakopane");

        FindFlight findFlight = new FindFlight();

        try {
            findFlight.findFlight(flight);

        } catch (RouteNotFoundException e) {
            System.out.println("Fly is not available" + e);
        } finally {
            System.out.println("Thank You for using our site..");
        }

        try {
            findFlight.findFlight(flight1);
        } catch (RouteNotFoundException e) {
            System.out.println("Fly is not available" + e);
        } finally {
            System.out.println("Thank You for using our site..");
        }
    }
}
