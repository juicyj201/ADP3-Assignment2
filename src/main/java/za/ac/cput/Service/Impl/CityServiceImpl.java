package za.ac.cput.Service.Impl;

import org.springframework.stereotype.Service;
import za.ac.cput.Domain.Entities.City;
import za.ac.cput.Domain.Entities.Country;
import za.ac.cput.Repository.Interface.CityRepository;
import za.ac.cput.Repository.Interface.Impl.CityRepositoryImpl;
import za.ac.cput.Service.Interface.CityService;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Optional;

/*
 *
 * Delron Chad Claassen - 219360561
 * City Service Implementation
 * ++++++++++++++++++++++++++++++++
 *           Question 4
 * ++++++++++++++++++++++++++++++++
 *
 */

@Service
public class CityServiceImpl implements CityService {

    private final CityRepository cityRepository;
    private static CityService cityService;

    public CityServiceImpl(){ this.cityRepository = CityRepositoryImpl.getCityRepository();}

    public static CityService getService() {
        if (cityService == null)
            cityService = new CityServiceImpl();
        return cityService;
    }

    @Override
    public City save(City city) {
        return this.cityRepository.save(city);
    }

    @Override
    public Optional<City> read(City city) {
        //return Optional.ofNullable(this.cityRepository.read(city.getCityID()));
        return Optional.ofNullable(this.cityRepository.read(city.getCityID()).get());
    }

    @Override
    public void delete(City city) {
        this.cityRepository.delete(city.getCityID());
    }

    @Override
    public List<City> readAll() {
        return this.cityRepository.getall();
    }

    //Question 5
    @Override
    public List<City> getCitiesByCountryId(String countryID) {
        /**
        List<City> cities = readAll();
        for (City city : cities) {
            if(city.getCountry().getCountryID().equalsIgnoreCase(countryID)) {
                return cities.stream().allMatch(c -> c.getCountry().getCountryID().equals(countryID));
            }
        }
        return null;
         **/
        List<City> cities = readAll();
        for (City city : cities) {
            if(cities.stream().allMatch(c -> c.getCountry().getCountryID().equals(countryID))) {
                return cities.stream().toList();
            }
        }
        return null;
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
