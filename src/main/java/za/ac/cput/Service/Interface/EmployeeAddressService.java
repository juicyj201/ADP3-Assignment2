package za.ac.cput.Service.Interface;

import org.springframework.stereotype.Service;
import za.ac.cput.Domain.Entities.Lookup.EmployeeAddress;

import java.util.List;
import java.util.Optional;

/**
 * Joshua Julies
 * 220102473
 * ----------
 * Question 4
 */

public interface EmployeeAddressService extends IService<EmployeeAddress>{
    public EmployeeAddress save(EmployeeAddress employeeAddress);
    public Optional<EmployeeAddress> read(EmployeeAddress employeeAddress);
    public void delete(EmployeeAddress employeeAddress);
    public List<EmployeeAddress> readAll();
    public String getEmployeeNameByCity(String cityId);
}
