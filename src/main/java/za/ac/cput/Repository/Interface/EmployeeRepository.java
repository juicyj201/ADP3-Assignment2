package za.ac.cput.Repository.Interface;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.Domain.Entities.Employee;

/**
 * Matthew Jones
 * 220077681
 * Question 3
 */

public interface EmployeeRepository extends JpaRepository<Employee, String> {
}
