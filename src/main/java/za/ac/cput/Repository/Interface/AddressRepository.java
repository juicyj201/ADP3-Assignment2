package za.ac.cput.Repository.Interface;

import org.springframework.stereotype.Repository;
import za.ac.cput.Domain.Entities.Address;

import javax.persistence.Id;
import java.util.*;

/**
 * Joshua Julies
 * 220102473
 *
 *  Question 3
 **/

@Repository
public interface AddressRepository extends IRepository<Address> {
    //classes inheriting or implementing this repository will have access to CrudRepo operations
    @Override
    public Address update(String compositeId, Address entity);
}
