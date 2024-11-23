package org.example;

public class CountryCodeUtil {

    public static String getCountryCode(Country country) {
        return switch (country) {
            case SPAIN -> "34";
            case GUATEMALA -> "502";
            case CHILE -> "56";
            case UNITEDSTATES -> "1";
        };
    }
}
