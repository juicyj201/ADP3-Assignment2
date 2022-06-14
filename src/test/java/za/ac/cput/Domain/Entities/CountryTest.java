package za.ac.cput.Domain.Entities;

/*
 *
 * Delron Chad Claassen - 219360561
 * Country Entity Test
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

class CountryTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void test() {
        Country country = CountryFactory.createCountry("country001", "South Africa");

        System.out.println(country.toString());
    }

}