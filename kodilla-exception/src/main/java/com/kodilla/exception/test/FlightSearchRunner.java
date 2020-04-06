package com.kodilla.exception.test;

public class FlightSearchRunner {
    public static void main(String[] args){

        Flight flight= new Flight("Krakow","Dublin");
        FlightSearch flightSearch= new FlightSearch();

        try {
            flightSearch.findFlight(flight);
        }
        catch (RouteNotFoundException e){
            System.out.println("Nie mozesz poleciec na to lotnisko");
        }
        finally {
            System.out.println("Ukończono przeszukiwanie");
        }
    }
}
