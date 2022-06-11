package za.ac.cput.Factory.Lookup;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import za.ac.cput.Domain.Entities.Address;
import za.ac.cput.Domain.Entities.City;
import za.ac.cput.Domain.Entities.Lookup.EmployeeAddress;
import za.ac.cput.Factory.AddressFactory;

public class EmployeeAddressFactoryTest {
    //staffId
    private String staffId = "01";

    //address
    private String unitNumber = "09";
    private String complexName = "Mayfair complex";
    private String streetNumber = "32";
    private String streetName = "Mayfair Street";
    private int postalCode = 9000;
    private City city = new City();
    private Address addrTest = new Address.AddressBuilder()
            .createUnitNumber(unitNumber)
            .createComplexName(complexName)
            .createStreetNumber(streetNumber)
            .createStreetName(streetName)
            .createPostalCode(postalCode)
            .createCity(city)
            .build();

    private EmployeeAddress empAddrTest = new EmployeeAddress.EmployeeAddressBuilder()
            .createStaffId(staffId)
            .createAddress(addrTest)
            .build();

    @Test
    public void testAddressFactory(){
        Assertions.assertNotEquals(empAddrTest, new EmployeeAddressFactory().buildEmployeeAddress(staffId, addrTest));
    }
}
