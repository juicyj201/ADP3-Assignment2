package za.ac.cput.Repository.Interface;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.Domain.Entities.Employee;

import java.util.List;
import java.util.Optional;

/**
 * Matthew Jones
 * 220077681
 * Question 3
 */

@Repository
public interface EmployeeRepository extends IRepository<Employee, String> {
    @Override
    Employee save(Employee employee);

    @Override
    Optional<Employee> read(String s);

    @Override
    void delete(String s);

    List<Employee> readAll();
}
