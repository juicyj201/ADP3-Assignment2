package za.ac.cput.Service.Impl;

import za.ac.cput.Domain.Entities.Country;
import za.ac.cput.Repository.Interface.CountryRepository;
import za.ac.cput.Repository.Interface.Impl.CityRepositoryImpl;
import za.ac.cput.Repository.Interface.Impl.CountryRepositoryImpl;
import za.ac.cput.Service.Interface.CityService;
import za.ac.cput.Service.Interface.CountryService;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Optional;

/*
 *
 * Delron Chad Claassen - 219360561
 * Country Service Implementation
 * ++++++++++++++++++++++++++++++++
 *           Question 4
 * ++++++++++++++++++++++++++++++++
 *
 */

public class CountryServiceImpl implements CountryService {
    private final CountryRepository countryRepository;
    private static CountryService countryService;

    public CountryServiceImpl(){ this.countryRepository = CountryRepositoryImpl.getCountryRepository(); }

    public static CountryService getService() {
        if (countryService == null)
            countryService = new CountryServiceImpl();
        return countryService;
    }

    @Override
    public Country save(Country country) {
        return this.countryRepository.save(country);
    }

    @Override
    public Optional<Country> read(Country country) {
        return Optional.ofNullable(this.countryRepository.read(country.getCountryID()).get());
    }

    @Override
    public void delete(Country country) {
        this.countryRepository.delete(country.getCountryID());
    }

    @Override
    public List<Country> readAll() {
        return this.countryRepository.getall();
    }

    @Override
    public String value() {
        return null;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
