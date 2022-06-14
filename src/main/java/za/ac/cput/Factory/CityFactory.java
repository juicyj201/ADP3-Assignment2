package za.ac.cput.Factory;

/*
 *
 * Delron Chad Claassen - 219360561
 * City Factory
 * ++++++++++++++++
 * Question 2.a
 *
 */

import za.ac.cput.Domain.Entities.City;
import za.ac.cput.Domain.Entities.Country;
import za.ac.cput.util.helper;

public class CityFactory {

    public static City createCity(String cityID, String cityName, Country country) {
        return new City.CityBuilder()
                .setID(cityID)
                .setCityName(cityName)
                .setCountry(country)
                .build();
    }

}
