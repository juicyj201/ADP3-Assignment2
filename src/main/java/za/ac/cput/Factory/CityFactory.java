package za.ac.cput.Factory;

/*
 *
 * Delron Chad Claassen - 219360561
 * City Factory
 * ++++++++++++++++++++++++++++++++
 *          Question 2.a
 * ++++++++++++++++++++++++++++++++
 *
 */

import za.ac.cput.Domain.Entities.City;
import za.ac.cput.Domain.Entities.Country;
import za.ac.cput.util.helper;

public class CityFactory {

    public static City createCity(String cityID, String cityName, Country country) {

        if(helper.isNullorEmpty(cityID) || helper.isNullorEmpty(cityName) || helper.isNullorEmpty(country.toString())){
            throw new IllegalArgumentException("City Id, City name or Country is empty/null.");
        }

        return new City.CityBuilder()
                .setID(cityID)
                .setCityName(cityName)
                .setCountry(country)
                .build();
    }

}
