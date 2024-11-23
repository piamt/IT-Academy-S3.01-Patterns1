package org.example.vehicles;

import org.example.Vehicle;

public class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Starting the car");
    }

    @Override
    public void speedUp() {
        System.out.println("Speeding up the car");
    }

    @Override
    public void brake() {
        System.out.println("Braking the car");
    }
}