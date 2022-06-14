package za.ac.cput.Service.Interface;

import org.springframework.stereotype.Service;
import za.ac.cput.Domain.Entities.Address;

import java.util.List;
import java.util.Optional;

/**
 * Joshua Julies
 * 220102473
 * ----------
 * Question 4
 */

public interface AddressService extends IService<Address>{
    public Address save(Address address);
    public Optional<Address> read(Address address);
    public void delete(Address address);
    public List<Address> readAll();
}
