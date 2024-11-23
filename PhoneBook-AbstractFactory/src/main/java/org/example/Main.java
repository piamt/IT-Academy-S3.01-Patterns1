package org.example;

import org.example.factories.Address;
import org.example.factories.PhoneBook;
import org.example.factories.PhoneNumber;
import org.example.implementations.PhoneBookImpl;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Contact> agenda = new ArrayList<>();

        PhoneBook phoneBookSpain = new PhoneBookImpl(Country.SPAIN);
        PhoneBook phoneBookChile = new PhoneBookImpl(Country.CHILE);
        PhoneBook phoneBookUnitedStates = new PhoneBookImpl(Country.UNITEDSTATES);
        PhoneBook phoneBookGuatemala = new PhoneBookImpl(Country.GUATEMALA);

        agenda.add(new Contact(
                "Pia",
                phoneBookSpain.createAddress("Avinguda Francesc Macia, Viladecans"),
                phoneBookSpain.createPhoneNumber("654332219")));

        agenda.add(new Contact(
                "Katy",
                phoneBookChile.createAddress("Calle José Victorino Lastarria, Santiago"),
                phoneBookChile.createPhoneNumber("934113345")));

        agenda.add(new Contact(
                "Williams",
                phoneBookUnitedStates.createAddress("3397 Lauren Drive, Madison"),
                phoneBookUnitedStates.createPhoneNumber("608-370-2484")));

        agenda.add(new Contact(
                "Sam",
                phoneBookUnitedStates.createAddress("4480 Tetrick Road, Florida"),
                phoneBookUnitedStates.createPhoneNumber("863-301-6033")));

        agenda.add(new Contact(
                "Williams",
                phoneBookGuatemala.createAddress("Aldea San Felipe De Lara, Rio Dulce"),
                phoneBookGuatemala.createPhoneNumber("79305046")));

        agenda.forEach(contact -> {
            System.out.println("\nContact: " + contact.name);
            contact.address.visit();
            contact.number.call();
        });
    }
}