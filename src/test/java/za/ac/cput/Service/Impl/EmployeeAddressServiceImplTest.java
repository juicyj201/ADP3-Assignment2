package za.ac.cput.Service.Impl;

import za.ac.cput.Domain.Entities.Address;
import za.ac.cput.Domain.Entities.City;
import za.ac.cput.Domain.Entities.Lookup.EmployeeAddress;
import za.ac.cput.Factory.AddressFactory;
import za.ac.cput.Factory.Lookup.EmployeeAddressFactory;
import za.ac.cput.Repository.Interface.AddressRepository;
import za.ac.cput.Repository.Interface.EmployeeAddressRepository;

/**
 * Joshua Julies
 * 220102473
 * ----------
 * Question 4
 */

public class EmployeeAddressServiceImplTest {
    private EmployeeAddress addr = new EmployeeAddressFactory().buildEmployeeAddress("01", new Address());
    private EmployeeAddressRepository repo = null;
    private EmployeeAddressServiceImpl service = new EmployeeAddressServiceImpl();

    /**
    @Test
    public void testSave(){
        Assertions.assertNotNull(service.save(addr));
    }

    @Test
    public void testRead(){
        Assertions.assertNotNull(service.read(addr));
    }

    @Test
    public void testDelete(){
        service.delete(addr);
        Assertions.assertNull(service.read(addr));
    }
    **/
}
