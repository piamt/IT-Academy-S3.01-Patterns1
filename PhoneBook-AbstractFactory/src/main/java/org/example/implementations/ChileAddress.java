package org.example.implementations;

import org.example.Country;
import org.example.factories.Address;

public class ChileAddress implements Address {

    String address;

    public ChileAddress(String address) {
        this.address = address;
    }

    @Override
    public void visit() {
        System.out.println("Visit address: " + address + " - " + Country.CHILE);
    }
}
