package za.ac.cput.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.Domain.Entities.City;
import za.ac.cput.Domain.Entities.Student;
import za.ac.cput.Service.Impl.CityServiceImpl;
import za.ac.cput.Service.Impl.StudentServiceImpl;

import java.util.List;
import java.util.Optional;

public class CityController {
    private final CityServiceImpl service;

    @Autowired
    public CityController(CityServiceImpl service){
        this.service = service;
    }

    @PostMapping("save")
    private ResponseEntity<City> save(City city){
        City savecity = service.save(city);
        return ResponseEntity.ok(savecity);
    }

    @GetMapping("read/{student}")
    private ResponseEntity<City> readById(@PathVariable City city){
        City readCity = this.service.read(city)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        return ResponseEntity.ok(readCity);
    }

    @GetMapping("readAll")
    private ResponseEntity<List<City>> readAll(){
        List<City> cityList = this.service.readAll();
        return ResponseEntity.ok(cityList);
    }

    @DeleteMapping("delete")
    private ResponseEntity<String> delete(@PathVariable City city){
        Optional<City> c = this.service.read(city);
        if(c.isPresent() == true) {
            this.service.delete(c.get());
        }

        return ResponseEntity.noContent().build();
    }

    @GetMapping("getCities/{countryId}")
    public ResponseEntity<List<City>> getStudentLastNameByCountry(@PathVariable String countryId){
        //List<City> cities = this.service.getCitiesByCountryId(countryId);
        //return ResponseEntity.ok(cities);
        return null;
    }
}
