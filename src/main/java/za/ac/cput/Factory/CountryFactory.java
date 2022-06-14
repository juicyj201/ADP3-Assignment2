package za.ac.cput.Factory;

import za.ac.cput.Domain.Entities.Country;

public class CountryFactory {

    public static Country createCountry(String countryID, String countryName){
        return new Country.CountryBuilder()
                .setCountryID(countryID)
                .setCountryName(countryName)
                .build();
    }

}
