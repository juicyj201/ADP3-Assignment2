package za.ac.cput.Service.Interface;

import za.ac.cput.Domain.Entities.Address;
import za.ac.cput.Domain.Entities.City;
import za.ac.cput.Domain.Entities.Country;

import java.util.List;
import java.util.Optional;

/*
 *
 * Delron Chad Claassen - 219360561
 * City Service
 * ++++++++++++++++++++++++++++++++
 *           Question 4
 * ++++++++++++++++++++++++++++++++
 *
 */

public interface CityService extends IService<City>{

    City save(City city);
    Optional<City> read(City city);
    void delete(City city);
    City getCitiesByCountryId(String countryID);
    List<City> readAll();

}
