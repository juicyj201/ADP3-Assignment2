package za.ac.cput.Factory;

/*
 *
 * Delron Chad Claassen - 219360561
 * Country Factory Test
 * ++++++++++++++++
 * Question 2.b
 *
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.Domain.Entities.Country;
import za.ac.cput.util.helper;

import static org.junit.jupiter.api.Assertions.*;

class CountryFactoryTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testCreateCountry() {
        Country country = CountryFactory.createCountry("country001", "South Africa");
        System.out.println(country.toString());
        Assertions.assertNotNull(country);
    }

}