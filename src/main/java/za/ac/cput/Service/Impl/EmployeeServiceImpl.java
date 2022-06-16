package za.ac.cput.Service.Impl;


import za.ac.cput.Domain.Entities.Employee;
import za.ac.cput.Domain.Entities.Name;
import za.ac.cput.Repository.Interface.EmployeeRepository;
import za.ac.cput.Service.Interface.EmployeeService;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Optional;

/**
 * Matthew Jones
 * 220077681
 * Question 4
 */

public class EmployeeServiceImpl implements EmployeeService
{
    private static EmployeeRepository empRepo;

    public EmployeeServiceImpl(EmployeeRepository empRepo){
        this.empRepo = empRepo;
    }

    @Override
    public Employee save(Employee employee) {
        return this.empRepo.save(employee);
    }

    @Override
    public Optional<Employee> read(Employee employee) {
        return this.empRepo.findById(employee.getStaffId());
    }

    @Override
    public void delete(Employee employee) {
        this.empRepo.delete(employee);
    }

    @Override
    public List<Employee> readAll() {
        return this.empRepo.findAll();
    }

    @Override
    public Employee getEmployeeNameByEmail(String employeeEmail) {
        return null;
    }


    @Override
    public List<Employee> getAll() {
        return null;
    }

    @Override
    public String value() {
        return null;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
