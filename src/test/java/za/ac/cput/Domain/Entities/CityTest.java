package za.ac.cput.Domain.Entities;

/*
 *
 * Delron Chad Claassen - 219360561
 * City Entity Test
 * ++++++++++++++++
 * Question 2.b
 *
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.Factory.CountryFactory;
import za.ac.cput.util.helper;

import static org.junit.jupiter.api.Assertions.*;

class CityTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void test() {
        Country country = CountryFactory.createCountry("country001", "South Africa" );

        City city = new City.CityBuilder()
                .setID("city001")
                .setCityName("Cape Town")
                .setCountry(country)
                .build();

        System.out.println(city.toString());
    }
}