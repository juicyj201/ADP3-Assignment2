package za.ac.cput.Controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import za.ac.cput.Domain.Entities.Address;
import za.ac.cput.Domain.Entities.City;
import za.ac.cput.Domain.Entities.Employee;
import za.ac.cput.Domain.Entities.Lookup.EmployeeAddress;
import za.ac.cput.Domain.Entities.Name;
import za.ac.cput.Factory.EmployeeFactory;
import za.ac.cput.Factory.Lookup.EmployeeAddressFactory;
import za.ac.cput.Repository.Interface.Impl.EmployeeRepositoryImpl;
import za.ac.cput.Service.Impl.EmployeeAddressServiceImpl;
import za.ac.cput.Service.Impl.EmployeeServiceImpl;
import za.ac.cput.Service.Interface.EmployeeAddressService;
import za.ac.cput.Service.Interface.EmployeeService;

/**
 * Matthew Jones
 * 220077681
 * Question 9
 */

public class EmployeeControllerTest {
    private Employee empaddr = EmployeeFactory.createEmployee("01", "01@mail.com", new Name.NameBuilder().setFirstName("Jeff").build());
    private EmployeeService service = EmployeeServiceImpl.getService();

    @Test
    public void testSave(){
        Assertions.assertNotNull(this.service.save(empaddr));
    }

    @Test
    public void testRead(){
        Assertions.assertNotNull(this.service.read(empaddr));
    }

    @Test
    public void testReadAll(){
        Assertions.assertNotNull(this.service.readAll());
    }

    @Test
    public void testDelete(){
        this.service.delete(empaddr);
        if(this.service.read(empaddr) != null){
            System.out.println("It works.");
        }else{
            throw new NullPointerException("It does not work");
        }
    }

    @Test
    public void testGetCities(){
        Assertions.assertNotNull(this.service.getEmployeeNameByEmail("01@mail.com"));
    }
}
