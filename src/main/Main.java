package main;

import data.LocationServices;
import entities.Locations;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        LocationServices dao = new LocationServices();

        System.out.println("All Locations");
        List<Locations> locations = dao.getAllLocations();
        locations.forEach(System.out::println);

        System.out.println();
        System.out.println("Location with id: 1700");
        Locations loc = dao.getLocationsById(1700);
        System.out.println(loc);

        System.out.println();
        System.out.println("Locations First page");
        locations = dao.getLocationsFirstPage(5);
        locations.forEach(System.out::println);
    }
}
