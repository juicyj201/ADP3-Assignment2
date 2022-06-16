package za.ac.cput.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.Domain.Entities.Address;
import za.ac.cput.Service.Impl.AddressServiceImpl;

import java.util.List;
import java.util.Optional;

@RestController
public class CityController {
    /**private CityServiceImpl service;

    @Autowired
    public CityController(CityServiceImpl service){
        this.service = service;
    }

    @PostMapping("save")
    private City save(City city){
        return this.service.save(city);
    }

    @GetMapping("read/{city}")
    private Optional<City> read(@PathVariable City city){
        return this.service.read(city);
    }

    @GetMapping("readAll")
    private List<City> readAll(){
        return this.service.readAll();
    }

    @DeleteMapping("delete")
    private void delete(@PathVariable City city){
        this.service.delete(city);
    }

     @GetMapping("getCities/{countryId}")
     public List<City> getCitiesByCountry(@PathVariable String countryId){
        //This is a method that is static and can be called from within the CityServiceImpl class.
        //The method returns a list of only city objects. It is almost exactly the same as the read method but is static.

        return CityServiceImpl.getCitiesByCountryId(countryId);
     }

    **/
}
