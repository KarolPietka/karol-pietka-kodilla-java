package com.kodilla.good.patterns.challenges.Flights;

public class Application {
    public static void main (String []arg){

       String flightFrom = "Kraków";
       String flightTo = "Berlin";
       String flightThrough = "Paryż";
       FlightDataBase flightDataBase = new FlightDataBase();


       flightDataBase.setFlightDataBase();
        System.out.println("Flight from: " + flightFrom);
       FlightFinder.departure(flightFrom, flightDataBase);

        System.out.println("Flight to: " + flightTo);
       FlightFinder.arrival(flightTo, flightDataBase);

        System.out.println("Transfer in:" + flightThrough);
        FlightFinder.transfer(flightThrough, flightDataBase);
    }
}
