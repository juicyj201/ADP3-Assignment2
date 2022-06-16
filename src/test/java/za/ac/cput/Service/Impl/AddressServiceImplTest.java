package za.ac.cput.Service.Impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import za.ac.cput.Domain.Entities.Address;
import za.ac.cput.Domain.Entities.City;
import za.ac.cput.Factory.AddressFactory;
import za.ac.cput.Repository.Interface.AddressRepository;


/**
 * Joshua Julies
 * 220102473
 * ----------
 * Question 4
 */

public class AddressServiceImplTest {
    private Address addr = new AddressFactory().buildAddress("01","Heights", "45", "Boxenberg", 4500, new City());
    private AddressRepository repo = null;
    private AddressServiceImpl service = new AddressServiceImpl(repo);

    @Test
    public void testEr(){

    }

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
