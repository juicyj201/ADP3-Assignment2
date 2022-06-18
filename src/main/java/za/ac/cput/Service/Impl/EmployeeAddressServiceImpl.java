package za.ac.cput.Service.Impl;

import org.springframework.stereotype.Service;
import za.ac.cput.Domain.Entities.Employee;
import za.ac.cput.Domain.Entities.Lookup.EmployeeAddress;
import za.ac.cput.Repository.Interface.EmployeeRepository;
import za.ac.cput.Repository.Interface.Impl.EmployeeAddressRepositoryImpl;
import za.ac.cput.Repository.Interface.EmployeeAddressRepository;
import za.ac.cput.Repository.Interface.Impl.EmployeeRepositoryImpl;
import za.ac.cput.Service.Interface.EmployeeAddressService;
import za.ac.cput.Service.Interface.EmployeeService;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Optional;

/**
 * Joshua Julies
 * 220102473
 * ----------
 * Question 4
 */

@Service
public class EmployeeAddressServiceImpl implements EmployeeAddressService {
    private final EmployeeAddressRepository repo;
    private static EmployeeAddressService service;
    private final EmployeeRepository emprepo = EmployeeRepositoryImpl.getEmployeeRepository();
    private EmployeeService empserv = new EmployeeServiceImpl();

    public EmployeeAddressServiceImpl(){
        this.repo = EmployeeAddressRepositoryImpl.getEmployeeAddressRepository();
    }

    public static EmployeeAddressService getService(){
        if(service == null){
            service = new EmployeeAddressServiceImpl();
        }

        return service;
    }


    @Override
    public EmployeeAddress save(EmployeeAddress employeeAddress) {
        return this.repo.save(employeeAddress);
    }

    @Override
    public Optional<EmployeeAddress> read(EmployeeAddress employeeAddress) {
        return this.repo.read(employeeAddress.getStaffId());
    }

    @Override
    public void delete(EmployeeAddress employeeAddress) {
        this.repo.delete(employeeAddress.getStaffId());
    }

    @Override
    public List<EmployeeAddress> readAll() {
        return this.repo.readAll();
    }

    @Override
    public String getEmployeeNameByCity(String cityId) {
        List<EmployeeAddress> empAddName = this.repo.readAll();
        List<Employee> emp = this.emprepo.readAll();
        for(EmployeeAddress name : empAddName){
            if(name.getAddress().getCity().getCityID().equals(cityId)){
                String empId = name.getStaffId();
                return this.emprepo.read(empId).toString();
            }
        }
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
