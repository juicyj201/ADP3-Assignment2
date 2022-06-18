package za.ac.cput.Repository.Interface;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.Domain.Entities.Employee;
import za.ac.cput.Domain.Entities.Lookup.EmployeeAddress;

import java.util.List;
import java.util.Optional;

/**
 * Matthew Jones
 * 220077681
 * Question 3
 */

@Repository
public interface EmployeeRepository extends IRepository<Employee, String> {
    Employee save(Employee employee);
    Optional<Employee> read(String id);
    List<Employee> readAll();
    void delete(String id);
}
