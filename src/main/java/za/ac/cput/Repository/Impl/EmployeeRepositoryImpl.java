package za.ac.cput.Repository.Impl;

import za.ac.cput.Domain.Entities.Employee;
import za.ac.cput.Domain.Entities.Name;
import za.ac.cput.Repository.Interface.EmployeeRepository;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImpl implements EmployeeRepository {

    private final List<Employee> emp;
    private static EmployeeRepository empRepository = null;

    public EmployeeRepositoryImpl() {
        this.emp = new ArrayList<>();
    }

    public static EmployeeRepository getEmployeeRepository() {
        if (empRepository == null)
            empRepository = new EmployeeRepositoryImpl();

        return empRepository;
    }

    @Override
    public Employee create(Employee employee) {
        this.emp.add(employee);
        return employee;
    }

    @Override
    public Employee read(String s) {
        return this.emp.stream()
                .filter(e -> e.getStaffId().equalsIgnoreCase(s))
                .findAny().orElse(null);
    }

    @Override
    public Employee update(Employee employee) {
        Employee e = read(employee.getStaffId());
        if (e != null) {
            Employee updated = new Employee.EmployeeBuilder().copy(e)
                    .setStaffId(employee.getStaffId())
                    .build();
            delete(e.getStaffId());
            this.emp.add(updated);
            e = updated;
        }
        return e;
    }

    @Override
    public void delete(String s) {
        Employee employee = read(s);
        this.emp.remove(employee);
    }

    @Override
    public List<Employee> getAll() {
        return this.emp;
    }
}
