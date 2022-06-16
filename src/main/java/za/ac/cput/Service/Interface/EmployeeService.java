package za.ac.cput.Service.Interface;

import za.ac.cput.Domain.Entities.Employee;
import za.ac.cput.Domain.Entities.Name;

import java.util.List;
import java.util.Optional;

/**
 * Matthew Jones
 * 220077681
 * Question 4
 */

public interface EmployeeService extends IService<Employee>
{
    @Override
    Employee save(Employee entity);

    @Override
    Optional<Employee> read(Employee entity);

    @Override
    void delete(Employee entity);

    @Override
    List<Employee> readAll();

    public String getEmployeeNameByEmail(String employeeEmail);
    List<Employee> getAll();
}
