package za.ac.cput.Repository.Interface;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.Domain.Entities.Address;
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
public interface EmployeeAddressRepository extends IRepository<EmployeeAddress, String> {
    EmployeeAddress save(EmployeeAddress employeeAddress);
    Optional<EmployeeAddress> read(String id);
    List<EmployeeAddress> readAll();
    void delete(EmployeeAddress employeeAddress);
}
