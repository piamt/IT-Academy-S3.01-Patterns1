package org.example;

public enum Country {
    SPAIN("Spain"),
    GUATEMALA("Guatemala"),
    CHILE("Chile"),
    UNITEDSTATES("United states");

    private final String name;

    private Country(String s) {
        name = s;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
