package za.ac.cput.Service.Impl;

import org.springframework.stereotype.Service;
import za.ac.cput.Domain.Entities.Lookup.EmployeeAddress;
import za.ac.cput.Repository.Interface.EmployeeAddressRepository;
import za.ac.cput.Service.Interface.EmployeeAddressService;

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

    public EmployeeAddressServiceImpl(EmployeeAddressRepository repo){
        this.repo = repo;
    }


    @Override
    public EmployeeAddress save(EmployeeAddress employeeAddress) {
        return this.repo.save(employeeAddress);
    }

    @Override
    public Optional<EmployeeAddress> read(EmployeeAddress employeeAddress) {
        return this.repo.findById(employeeAddress.getStaffId());
    }

    @Override
    public void delete(EmployeeAddress employeeAddress) {
        this.repo.delete(employeeAddress);
    }

    @Override
    public List<EmployeeAddress> readAll() {
        return this.repo.findAll();
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
