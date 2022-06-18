package za.ac.cput.Factory;

/*
 *
 * Delron Chad Claassen - 219360561
 * City Factory Test
 * ++++++++++++++++
 * Question 2.b
 *
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.Domain.Entities.City;
import za.ac.cput.Domain.Entities.Country;
import za.ac.cput.util.helper;

import static org.junit.jupiter.api.Assertions.*;

class CityFactoryTest {
    @Test
    void testCreateCity() {
        Country country = CountryFactory.createCountry("country001", "South Africa");

        City city = CityFactory.createCity("city001", "Cape Town", country);
        System.out.println(city.toString());
        Assertions.assertNotNull(country);
    }
}