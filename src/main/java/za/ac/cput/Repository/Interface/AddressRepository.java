package za.ac.cput.Repository.Interface;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.Domain.Entities.Address;

import java.util.List;
import java.util.Optional;


/**
 * Joshua Julies
 * 220102473
 *
 *  Question 3
 **/

@Repository
public interface AddressRepository extends IRepository<Address, String> {
    Address save(Address address);
    Optional<Address> read(String id);
    List<Address> readAll();
    void delete(String id);
}
