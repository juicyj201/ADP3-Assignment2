package za.ac.cput.Repository.Interface;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.Domain.Entities.Address;


/**
 * Joshua Julies
 * 220102473
 *
 *  Question 3
 **/

@Repository
public interface AddressRepository extends JpaRepository<Address, String> {
    //classes inheriting or implementing this repository will have access to CrudRepo operations
}
