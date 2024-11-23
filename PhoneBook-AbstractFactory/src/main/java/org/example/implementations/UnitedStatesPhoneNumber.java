package org.example.implementations;

import org.example.Country;
import org.example.CountryCodeUtil;
import org.example.factories.PhoneNumber;

public class UnitedStatesPhoneNumber implements PhoneNumber {
    String number;

    public UnitedStatesPhoneNumber(String number) {
        this.number = number;
    }

    @Override
    public void call() {
        System.out.println("Calling number: +" + CountryCodeUtil.getCountryCode(Country.UNITEDSTATES) + number);
    }
}
