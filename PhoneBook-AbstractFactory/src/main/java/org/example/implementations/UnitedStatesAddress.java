package org.example.implementations;

import org.example.Country;
import org.example.factories.Address;

public class UnitedStatesAddress implements Address {

    String address;

    public UnitedStatesAddress(String address) {
        this.address = address;
    }

    @Override
    public void visit() {
        System.out.println("Visit address: " + address + " - " + Country.UNITEDSTATES);
    }
}
