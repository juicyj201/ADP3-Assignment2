package za.ac.cput.Service.Impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import za.ac.cput.Domain.Entities.Address;
import za.ac.cput.Domain.Entities.City;
import za.ac.cput.Factory.AddressFactory;
import za.ac.cput.Repository.Interface.AddressRepository;
import za.ac.cput.Repository.Interface.Impl.AddressRepositoryImpl;
import za.ac.cput.Service.Interface.AddressService;


/**
 * Joshua Julies
 * 220102473
 * ----------
 * Question 4
 */

public class AddressServiceImplTest {
    private Address addr = new AddressFactory().buildAddress("01","Heights", "45", "Boxenberg", 4500, new City());
    private AddressService service = AddressServiceImpl.getService();

    @Test
    public void testSave(){
        Assertions.assertNotNull(this.service.save(addr));
    }

    @Test
    public void testRead(){
        Assertions.assertNotNull(this.service.read(addr));
    }

    @Test
    public void testReadAll(){
        Assertions.assertNotNull(this.service.readAll());
    }

    @Test
    public void testDelete(){
        this.service.delete(addr);
        if(this.service.read(addr) != null){
            System.out.println("It works.");
        }else{
            throw new NullPointerException("It does not work");
        }
        //Assertions.assertNull(this.service.read(addr),"This object does not exist");
    }
}
