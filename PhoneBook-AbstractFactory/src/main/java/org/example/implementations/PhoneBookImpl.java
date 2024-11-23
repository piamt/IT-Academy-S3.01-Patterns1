package org.example.implementations;

import org.example.Country;
import org.example.factories.Address;
import org.example.factories.PhoneBook;
import org.example.factories.PhoneNumber;


public class PhoneBookImpl implements PhoneBook {

    Country country;

    public PhoneBookImpl(Country country) {
        this.country = country;
    }

    @Override
    public Address createAddress(String address) {
        return switch (country) {
            case SPAIN -> new SpainAddress(address);
            case CHILE -> new ChileAddress(address);
            case GUATEMALA -> new GuatemalaAddress(address);
            case UNITEDSTATES -> new UnitedStatesAddress(address);
        };
    }

    @Override
    public PhoneNumber createPhoneNumber(String number) {
        return switch (country) {
            case SPAIN -> new SpainPhoneNumber(number);
            case CHILE -> new ChilePhoneNumber(number);
            case GUATEMALA -> new GuatemalaPhoneNumber(number);
            case UNITEDSTATES -> new UnitedStatesPhoneNumber(number);
        };
    }
}
