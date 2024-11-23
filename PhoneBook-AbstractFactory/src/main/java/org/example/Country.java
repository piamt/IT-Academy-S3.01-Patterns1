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

    public boolean equalsName(String otherName) {
        return name.equals(otherName);
    }

    public String toString() {
        return this.name;
    }
}
