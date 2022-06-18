package za.ac.cput.Service.Impl;


import za.ac.cput.Domain.Entities.Employee;
import za.ac.cput.Domain.Entities.Lookup.EmployeeAddress;
import za.ac.cput.Domain.Entities.Name;
import za.ac.cput.Repository.Interface.EmployeeAddressRepository;
import za.ac.cput.Repository.Interface.EmployeeRepository;
import za.ac.cput.Repository.Interface.Impl.EmployeeRepositoryImpl;
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
    private final EmployeeRepository empRepo;
    private static EmployeeService service;

    public EmployeeServiceImpl(){
        this.empRepo = EmployeeRepositoryImpl.getEmployeeRepository();
    }

    public static EmployeeService getService(){
        if(service == null){
            service = new EmployeeServiceImpl();
        }

        return service;
    }

    @Override
    public Employee save(Employee employee) {
        return this.empRepo.save(employee);
    }

    @Override
    public Optional<Employee> read(Employee employee) {
        return this.empRepo.read(employee.getStaffId());
    }

    @Override
    public void delete(Employee employee) {
        this.empRepo.delete(employee.getStaffId());
    }

    @Override
    public List<Employee> readAll() {
        return this.empRepo.readAll();
    }

    @Override
    public String getEmployeeNameByEmail(String employeeEmail) {
        List<Employee> empName = this.empRepo.readAll();
        for(Employee name : empName){
            if(name.getEmail().equals(employeeEmail)){
                return name.getName().toString();
            }
        }
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
