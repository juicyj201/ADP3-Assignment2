package za.ac.cput.Repository.Interface.Impl;

import za.ac.cput.Domain.Entities.City;
import za.ac.cput.Domain.Entities.Country;
import za.ac.cput.Repository.Interface.CountryRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/*
 *
 * Delron Chad Claassen - 219360561
 * Country Repository Implementation
 * ++++++++++++++++++++++++++++++++
 *           Question 3
 * ++++++++++++++++++++++++++++++++
 *
 */

public class CountryRepositoryImpl implements CountryRepository {

    private final List<Country> countries;
    private static CountryRepository countryRepository = null;

    public CountryRepositoryImpl() {
        this.countries = new ArrayList<>();
    }

    public static CountryRepository getCountryRepository() {
        if (countryRepository == null)
            countryRepository = new CountryRepositoryImpl();

        return countryRepository;
    }


    @Override
    public Country save(Country country) {
        this.countries.add(country);
        return country;
    }

    @Override
    public Optional<Country> read(String s) {
        return this.countries.stream()
                .filter(c -> c.getCountryID().equalsIgnoreCase(s))
                .findFirst().or(null);
    }

    /**
    @Override
    public Country update(Country country) {
        Country c = read(country.getCountryID());
        if (c != null) {
            Country updated = new Country.CountryBuilder().copy(c)
                    .setCountryName(country.getCountryName())
                    .build();
            delete(c.getCountryID());
            this.countries.add(updated);
            c = updated;
        }
        return c;
    }
     **/

    @Override
    public void delete(String s) {
        Optional<Country> country = read(s);
        this.countries.remove(country);
    }

    public List<Country> readAll(){
        return this.countries.stream().toList();
    }

    @Override
    public List<Country> getall() {
        return this.countries;
    }
}
