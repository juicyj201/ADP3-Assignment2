package za.ac.cput.Factory;

import org.junit.jupiter.api.*;
import za.ac.cput.Domain.Entities.Address;
import za.ac.cput.Domain.Entities.City;

/**
 * Joshua Julies
 * 220102473
 * ----------
 * Question 2
 */

public class AddressFactoryTest {
    private String unitNumber = "09";
    private String complexName = "Mayfair complex";
    private String streetNumber = "32";
    private String streetName = "Mayfair Street";
    private int postalCode = 9000;
    private City city = new City();
    private Address addrTest = new Address.AddressBuilder()
            .createUnitNumber(unitNumber)
            .createComplexName(complexName)
            .createStreetNumber(streetNumber)
            .createStreetName(streetName)
            .createPostalCode(postalCode)
            .createCity(city)
            .build();

    @Test
    public void testAddressFactory(){
        Assertions.assertEquals(addrTest, new AddressFactory().buildAddress(unitNumber, complexName, streetNumber, streetName, postalCode, city));
    }
}
