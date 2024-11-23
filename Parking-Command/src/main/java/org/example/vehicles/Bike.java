package org.example.vehicles;

import org.example.Vehicle;

public class Bike extends Vehicle {
    @Override
    public void start() {
        System.out.println("Starting the bike");
    }

    @Override
    public void speedUp() {
        System.out.println("Speeding up the bike");
    }

    @Override
    public void brake() {
        System.out.println("Braking the bike");
    }
}
