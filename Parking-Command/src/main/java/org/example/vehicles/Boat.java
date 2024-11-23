package org.example.vehicles;

import org.example.Vehicle;

public class Boat extends Vehicle {
    @Override
    public void start() {
        System.out.println("Starting the boat");
    }

    @Override
    public void speedUp() {
        System.out.println("Speeding up the boat");
    }

    @Override
    public void brake() {
        System.out.println("Braking the boat");
    }
}
