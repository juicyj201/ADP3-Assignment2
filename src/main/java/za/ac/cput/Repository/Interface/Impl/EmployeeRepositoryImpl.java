package za.ac.cput.Repository.Interface.Impl;

import org.springframework.stereotype.Repository;
import za.ac.cput.Domain.Entities.Employee;
import za.ac.cput.Domain.Entities.Lookup.EmployeeAddress;
import za.ac.cput.Repository.Interface.EmployeeAddressRepository;
import za.ac.cput.Repository.Interface.EmployeeRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


/**
 * Matthew Jones
 * 220077681
 * Question 3
 */

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {
    private List<Employee> employeeList;
    private static EmployeeRepository repo;

    private EmployeeRepositoryImpl() {
        this.employeeList = new ArrayList<>();
    }

    public static EmployeeRepository getEmployeeRepository() {
        if (repo == null) {
            repo = new EmployeeRepositoryImpl();
            return repo;
        }

        return null;
    }


    @Override
    public Employee save(Employee employee) {
        Optional<Employee> read = read(employee.getStaffId());

        if(read.isPresent()) {
            delete(read.get().getStaffId());
        }

        this.employeeList.add(employee);
        return employee;
    }

    @Override
    public Optional<Employee> read(String id) {
        return this.employeeList
                .stream()
                .filter(a -> a.getStaffId().equals(id))
                .findFirst();
    }

    @Override
    public List<Employee> readAll() {
        return this.employeeList.stream().toList();
    }

    @Override
    public void delete(String id) {
        employeeList.remove(id);
    }
}
