package za.ac.cput.Repository.Interface.Impl;

import za.ac.cput.Domain.Entities.Lookup.EmployeeAddress;
import za.ac.cput.Repository.Interface.EmployeeAddressRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmployeeAddressRepositoryImpl implements EmployeeAddressRepository {
    private List<EmployeeAddress> employeeAddressList;
    private static EmployeeAddressRepository repo;

    private EmployeeAddressRepositoryImpl() {
        this.employeeAddressList = new ArrayList<>();
    }

    public static EmployeeAddressRepository getEmployeeAddressRepository() {
        if (repo == null) {
            repo = new EmployeeAddressRepositoryImpl();
            return repo;
        }

        return null;
    }


    @Override
    public EmployeeAddress save(EmployeeAddress employeeAddress) {
        Optional<EmployeeAddress> read = read(employeeAddress.getStaffId());

        if(read.isPresent()) {
            delete(read.get().getStaffId());
        }

        this.employeeAddressList.add(employeeAddress);
        return employeeAddress;
    }

    @Override
    public Optional<EmployeeAddress> read(String id) {
        return this.employeeAddressList
                .stream()
                .filter(a -> a.getStaffId().equals(id))
                .findFirst();
    }

    @Override
    public List<EmployeeAddress> readAll() {
        return this.employeeAddressList.stream().toList();
    }

    @Override
    public void delete(String id) {
        employeeAddressList.remove(id);
    }
}
