package org.example.implementations;

import org.example.Country;
import org.example.factories.Address;

public class GuatemalaAddress implements Address {

    String address;

    public GuatemalaAddress(String address) {
        this.address = address;
    }

    @Override
    public void visit() {
        System.out.println("Visit address: " + address + " - " + Country.GUATEMALA);
    }
}
