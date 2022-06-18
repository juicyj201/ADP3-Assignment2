package za.ac.cput.Factory;

/*
 *
 * Delron Chad Claassen - 219360561
 * Country Factory
 * ++++++++++++++++++++++++++++++++
 *          Question 2.a
 * ++++++++++++++++++++++++++++++++
 *
 */

import za.ac.cput.Domain.Entities.Country;
import za.ac.cput.util.helper;

public class CountryFactory {

    public static Country createCountry(String countryID, String countryName){

        if(helper.isNullorEmpty(countryID) || helper.isNullorEmpty(countryName)){
            throw new IllegalArgumentException("Country Id or Country name is empty/null \r\n");
        }

        return new Country.CountryBuilder()
                .setCountryID(countryID)
                .setCountryName(countryName)
                .build();
    }

}
