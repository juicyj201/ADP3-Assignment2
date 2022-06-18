package za.ac.cput.Repository.Interface;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.Domain.Entities.Employee;

import java.util.List;

/**
 * Matthew Jones
 * 220077681
 * Question 3
 */

@Repository
public interface EmployeeRepository extends IRepository<Employee, String> {
    @Override
    Employee create(Employee employee);

    @Override
    Employee read(String s);

    @Override
    Employee update(Employee employee);

    @Override
    void delete(String s);

    List<Employee> getAll();
}
