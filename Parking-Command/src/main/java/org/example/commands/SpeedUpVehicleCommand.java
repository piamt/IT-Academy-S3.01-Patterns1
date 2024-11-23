package org.example.commands;

import org.example.Command;
import org.example.Vehicle;

public class SpeedUpVehicleCommand implements Command {

    private Vehicle vehicle;

    public SpeedUpVehicleCommand(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        vehicle.speedUp();
    }
}
