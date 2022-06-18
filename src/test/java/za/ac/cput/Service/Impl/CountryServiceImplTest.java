package za.ac.cput.Service.Impl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.Domain.Entities.City;
import za.ac.cput.Domain.Entities.Country;
import za.ac.cput.Factory.CountryFactory;
import za.ac.cput.Service.Interface.CountryService;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Delron Chad Claassen - 219360561
 * Service Test
 * ++++++++++++++++++++++++++++++++
 *           Question 4
 * ++++++++++++++++++++++++++++++++
 *
 */

class CountryServiceImplTest {

    private CountryService countryService;
    private Country country;

    @BeforeEach
    void setUp() {
        countryService = CountryServiceImpl.getService();
        country = CountryFactory.createCountry("country001", "South Africa");
    }

    @AfterEach
    void tearDown() {
        countryService = null;
        country = null;
    }

    @Test
    void test_a_Save() {
        Country savedCountry = countryService.save(country);
        System.out.println(savedCountry);
        assertNotNull(savedCountry);
    }

    @Test
    void test_b_Read() {
        Optional<Country> readCountry = countryService.read(country);
        assertNotNull(readCountry);
    }

    @Test
    void test_c_Delete() {
        countryService.delete(country);
        boolean afterDeleteCity = countryService.read(country).isPresent();
        assertFalse(afterDeleteCity);
    }

    @Test
    void test_d_ReadAll() {
        List<Country> cities = countryService.readAll();
        assertEquals(0, cities.size());
    }
}