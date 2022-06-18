package za.ac.cput.Service.Interface;

import za.ac.cput.Domain.Entities.Country;

import java.util.List;
import java.util.Optional;

/*
 *
 * Delron Chad Claassen - 219360561
 * Country Service
 * ++++++++++++++++++++++++++++++++
 *           Question 4
 * ++++++++++++++++++++++++++++++++
 *
 */

public interface CountryService extends IService<Country> {

    Country save(Country country);
    Optional<Country> read(Country country);
    void delete(Country country);
    List<Country> readAll();

}
