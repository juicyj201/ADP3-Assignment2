package za.ac.cput.Factory;

import za.ac.cput.Domain.Entities.Address;
import za.ac.cput.Domain.Entities.City;

/**
 * Joshua Julies
 * 220102473
 * ----------
 * Question 2
 */

public class AddressFactory {
    public Address buildAddress(String unitNumber, String complexName, String streetNumber, String streetName, int postalCode, City city){
        Address addr = new Address.AddressBuilder()
                .createUnitNumber(unitNumber)
                .createComplexName(complexName)
                .createStreetNumber(streetNumber)
                .createStreetName(streetName)
                .createPostalCode(postalCode)
                .createCity(city)
                .build();

        return addr;
    }
}
