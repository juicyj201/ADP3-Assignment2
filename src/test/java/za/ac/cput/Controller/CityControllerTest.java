package za.ac.cput.Controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.Domain.Entities.City;
import za.ac.cput.Domain.Entities.Country;
import za.ac.cput.Domain.Entities.Lookup.EmployeeAddress;
import za.ac.cput.Domain.Entities.Student;
import za.ac.cput.Factory.AddressFactory;
import za.ac.cput.Factory.CityFactory;
import za.ac.cput.Factory.Lookup.EmployeeAddressFactory;
import za.ac.cput.Service.Impl.CityServiceImpl;
import za.ac.cput.Service.Impl.EmployeeAddressServiceImpl;
import za.ac.cput.Service.Impl.StudentServiceImpl;
import za.ac.cput.Service.Interface.CityService;
import za.ac.cput.Service.Interface.EmployeeAddressService;

import java.util.List;
import java.util.Optional;

/**
 * Delron Chad Claassen - 219360561
 * Controller Test
 * ++++++++++++++++++++++++++++++++
 *           Question 9
 * ++++++++++++++++++++++++++++++++
 *
 */

public class CityControllerTest {
    private City city = CityFactory.createCity("01", "Cape Town", new Country.CountryBuilder().setCountryID("01").setCountryName("South Africa").build());
    private CityService service = CityServiceImpl.getService();

    @Test
    public void testSave(){
        Assertions.assertNotNull(this.service.save(city));
    }

    @Test
    public void testRead(){
        Assertions.assertNotNull(this.service.read(city));
    }

    @Test
    public void testReadAll(){
        Assertions.assertNotNull(this.service.readAll());
    }

    @Test
    public void testDelete(){
        this.service.delete(city);
        if(this.service.read(city) != null){
            System.out.println("It works.");
        }else{
            throw new NullPointerException("It does not work");
        }
    }

    @Test
    public void testGetCities(){
        Assertions.assertNotNull(this.service.getCitiesByCountryId("01"));
    }
}
