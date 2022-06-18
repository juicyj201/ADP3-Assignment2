package za.ac.cput.Service.Impl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.Domain.Entities.City;
import za.ac.cput.Domain.Entities.Country;
import za.ac.cput.Factory.CityFactory;
import za.ac.cput.Factory.CountryFactory;
import za.ac.cput.Repository.Interface.Impl.CityRepositoryImpl;
import za.ac.cput.Service.Interface.CityService;

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

class CityServiceImplTest {

    private CityService cityService;
    private City city;
    private Country country;

    @BeforeEach
    void setUp() {
        cityService = CityServiceImpl.getService();
        country = CountryFactory.createCountry("country001", "South Africa");
        city = CityFactory.createCity("city001", "Cape Town", country);
    }

    @AfterEach
    void tearDown() {
        cityService = null;
        country = null;
        city = null;
    }

    @Test
    void test_a_Save() {
        City savedCity = cityService.save(city);
        System.out.println(savedCity);
        assertNotNull(savedCity);
    }

    @Test
    void test_b_Read() {
        Optional<City> readCity = cityService.read(city);
        assertNotNull(readCity);
    }

    @Test
    void test_c_Delete() {
        cityService.delete(city);
        boolean afterDeleteCity = cityService.read(city).isPresent();
        assertFalse(afterDeleteCity);
    }

    @Test
    void test_d_ReadAll() {
        List<City> cities = cityService.readAll();
        assertEquals(0, cities.size());
    }
}