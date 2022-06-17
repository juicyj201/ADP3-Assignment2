package za.ac.cput.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.Domain.Entities.Address;
import za.ac.cput.Service.Impl.AddressServiceImpl;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("school-management/city")
public class CityController {
    /**private final CityServiceImpl service;

    @Autowired
    public CityController(CityServiceImpl service){
        this.service = service;
    }

    @PostMapping("save")
    private ResponseEntity<City></City> save(City city){
    City save = service.save(city);
    return ResponseEntity.ok(save);
    }

    @GetMapping("read/{city}")
    private ResponseEntity<City> read(@PathVariable City city){
    City c = this.service.read(city)
    .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    return ResponseEntity.ok(c);
    }

    @GetMapping("readAll")
    private ResponseEntity<List<City>> readAll(){
    List<City> cityList = this.service.readAll();
    return ResponseEntity.ok(cityList);
    }

    @DeleteMapping("delete")
    private ResponseEntity<Void> delete(@PathVariable City city){
    Optional<City> c = this.service.read(city);
    if(c.isPresent() == true) {
    this.service.delete(c.get());
    }

    return ResponseEntity.noContent().build();
    }

     @GetMapping("getCities/{countryId}")
     public List<City> getCitiesByCountry(@PathVariable String countryId){
        //This is a method that is static and can be called from within the CityServiceImpl class.
        //The method returns a list of only city objects. It is almost exactly the same as the read method but is static.

        List<City> cList = CityServiceImpl.getCitiesByCountryId(countryId);
        return ResponseEntity.ok(clist);
     }

    **/
}
