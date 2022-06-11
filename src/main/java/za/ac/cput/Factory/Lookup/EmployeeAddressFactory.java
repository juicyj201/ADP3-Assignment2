package za.ac.cput.Factory.Lookup;

import za.ac.cput.Domain.Entities.Address;
import za.ac.cput.Domain.Entities.City;
import za.ac.cput.Domain.Entities.Lookup.EmployeeAddress;

public class EmployeeAddressFactory {
    public EmployeeAddress buildEmployeeAddress(String staffId, Address address){
        EmployeeAddress empaddr = new EmployeeAddress.EmployeeAddressBuilder()
                .createStaffId(staffId)
                .createAddress(address)
                .build();

        return empaddr;
    }
}
