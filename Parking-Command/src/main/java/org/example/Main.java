package org.example;

import org.example.vehicles.Car;
import org.example.commands.BrakeVehicleCommand;
import org.example.commands.SpeedUpVehicleCommand;
import org.example.commands.StartVehicleCommand;

public class Main {
    public static void main(String[] args) {

        // Receiver
        Vehicle car = new Car();

        // Concrete Commands
        Command start = new StartVehicleCommand(car);
        Command speedUp = new SpeedUpVehicleCommand(car);
        Command brake = new BrakeVehicleCommand(car);

        // Invoker
        Parking parking = new Parking();

        // Execute commands
        parking.setCommand(start);
        parking.action();

        parking.setCommand(brake);
        parking.action();

        parking.setCommand(speedUp);
        parking.action();
    }
}