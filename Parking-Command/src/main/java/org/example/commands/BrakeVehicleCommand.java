package org.example.commands;

import org.example.Command;
import org.example.Vehicle;

public class BrakeVehicleCommand implements Command {

    private Vehicle vehicle;

    public BrakeVehicleCommand(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        vehicle.brake();
    }
}
