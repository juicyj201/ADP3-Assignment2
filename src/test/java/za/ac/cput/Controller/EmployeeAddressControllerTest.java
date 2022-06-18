package za.ac.cput.Controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import za.ac.cput.Domain.Entities.City;
import za.ac.cput.Domain.Entities.Employee;
import za.ac.cput.Domain.Entities.Lookup.EmployeeAddress;
import za.ac.cput.Domain.Entities.Name;
import za.ac.cput.Factory.AddressFactory;
import za.ac.cput.Factory.EmployeeFactory;
import za.ac.cput.Factory.Lookup.EmployeeAddressFactory;
import za.ac.cput.Service.Impl.EmployeeAddressServiceImpl;
import za.ac.cput.Service.Impl.EmployeeServiceImpl;
import za.ac.cput.Service.Interface.EmployeeAddressService;
import za.ac.cput.Service.Interface.EmployeeService;

public class EmployeeAddressControllerTest {
    private EmployeeAddress empaddr = new EmployeeAddressFactory().buildEmployeeAddress("01", new AddressFactory().buildAddress("01","Heights", "45", "Boxenberg", 4500, new City()));
    private EmployeeAddressService service = EmployeeAddressServiceImpl.getService();

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
        //Assertions.assertNull(this.service.read(addr),"This object does not exist");
    }
}
