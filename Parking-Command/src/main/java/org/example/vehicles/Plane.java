package org.example.vehicles;

import org.example.Vehicle;

public class Plane extends Vehicle {
    @Override
    public void start() {
        System.out.println("Starting the plane");
    }

    @Override
    public void speedUp() {
        System.out.println("Speeding up the plane");
    }

    @Override
    public void brake() {
        System.out.println("Braking the plane");
    }
}
