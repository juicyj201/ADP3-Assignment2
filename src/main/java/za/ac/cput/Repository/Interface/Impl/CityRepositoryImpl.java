package za.ac.cput.Repository.Interface.Impl;

import za.ac.cput.Domain.Entities.City;
import za.ac.cput.Repository.Interface.CityRepository;

import java.util.ArrayList;
import java.util.List;

/*
 *
 * Delron Chad Claassen - 219360561
 * City Repository Implementation
 * ++++++++++++++++++++++++++++++++
 *           Question 3
 * ++++++++++++++++++++++++++++++++
 *
 */

public class CityRepositoryImpl implements CityRepository {

    private final List<City> cities;
    private static CityRepository cityRepository = null;

    public CityRepositoryImpl() {
        this.cities = new ArrayList<>();
    }

    public static CityRepository getCityRepository() {
        if (cityRepository == null)
            cityRepository = new CityRepositoryImpl();

        return cityRepository;
    }


    @Override
    public City create(City city) {
        this.cities.add(city);
        return city;
    }

    @Override
    public City read(String s) {
        return this.cities.stream()
                .filter(c -> c.getCityID().equalsIgnoreCase(s))
                .findAny().orElse(null);
    }

    @Override
    public City update(City city) {
        City c = read(city.getCityID());
        if (c != null) {
            City updated = new City.CityBuilder().copy(c)
                    .setCityName(city.getCityName())
                    .build();
            delete(c.getCityID());
            this.cities.add(updated);
            c = updated;
        }
        return c;
    }

    @Override
    public void delete(String s) {
        City city = read(s);
        this.cities.remove(city);
    }

    @Override
    public List<City> getall() {
        return this.cities;
    }
}
