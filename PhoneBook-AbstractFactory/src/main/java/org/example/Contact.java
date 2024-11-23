package org.example;

import org.example.factories.Address;
import org.example.factories.PhoneNumber;

public class Contact {

    public String name;
    public Address address;
    public PhoneNumber number;

    public Contact(String name, Address address, PhoneNumber number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }
}
