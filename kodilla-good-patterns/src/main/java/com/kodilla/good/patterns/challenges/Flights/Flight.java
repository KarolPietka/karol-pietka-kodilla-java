package com.kodilla.good.patterns.challenges.Flights;

import java.util.Objects;

public class Flight {
    private String flightFrom;
    private String flightTo;
    private String flightThrough;

    public Flight(String flightFrom, String flightTo, String flightThrough) {
        this.flightFrom = flightFrom;
        this.flightTo = flightTo;
        this.flightThrough = flightThrough;
    }

    public String getFlightFrom() {
        return flightFrom;
    }

    public String getFlightTo() {
        return flightTo;
    }

    public String getFlightThrough() {
        return flightThrough;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;
        Flight flight = (Flight) o;
        return Objects.equals(flightFrom, flight.flightFrom) &&
                Objects.equals(flightTo, flight.flightTo) &&
                Objects.equals(flightThrough, flight.flightThrough);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightFrom, flightTo, flightThrough);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "From='" + flightFrom + '\'' +
                ", To='" + flightTo + '\'' +
                ", Through='" + flightThrough + '\'' +
                '}';
    }
}
