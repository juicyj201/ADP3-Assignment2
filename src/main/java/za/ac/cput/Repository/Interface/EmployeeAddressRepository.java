package za.ac.cput.Repository.Interface;

import org.springframework.stereotype.Repository;
import za.ac.cput.Domain.Entities.Address;
import za.ac.cput.Domain.Entities.Lookup.EmployeeAddress;

@Repository
public interface EmployeeAddressRepository extends IRepository<EmployeeAddress> {
    //classes inheriting or implementing this repository will have access to CrudRepo operations
    @Override
    public EmployeeAddress update(String Id, EmployeeAddress entity);
}
