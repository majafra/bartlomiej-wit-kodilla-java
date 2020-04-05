package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlightSearch {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airports = new HashMap<String, Boolean>();

        airports.put("Krakow", true);
        airports.put("London", true);
        airports.put("Berlin", true);
        airports.put("Moscow", true);
        airports.put("Dublin", false);

        if(airports.containsKey(flight.getArrivalAirport())&&airports.get(flight.getArrivalAirport())) {
            System.out.println("Możesz poleciec na to lotnisko");
        } else {
            throw new RouteNotFoundException();
        }
    }
}
