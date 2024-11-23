package org.example.commands;

import org.example.Command;
import org.example.Vehicle;

public class StartVehicleCommand implements Command {

    private Vehicle vehicle;

    public StartVehicleCommand(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        vehicle.start();
    }
}
