package za.ac.cput.Repository.Interface;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.Domain.Entities.Lookup.EmployeeAddress;

import java.util.List;
import java.util.Optional;

/**
 * Joshua Julies
 * 220102473
 * ----------
 * Question 3
 */

@Repository
public interface EmployeeAddressRepository extends JpaRepository<EmployeeAddress, String> {
    //classes inheriting or implementing this repository will have access to JpaRepo operations
}
