package org.example.factories;

public interface PhoneBook {
    public Address createAddress(String address);
    public PhoneNumber createPhoneNumber(String number);
}
