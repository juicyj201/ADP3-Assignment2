package za.ac.cput.Domain.Entities.Lookup;

import za.ac.cput.Domain.Entities.Address;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Joshua Julies
 * 220102473
 * ----------
 * Question 1
 */

@Entity(name="EmployeeAddress")
public class EmployeeAddress {
    @Id
    @Column(nullable = false)
    private final String staffId;
    @Column(nullable = false)
    private final Address address;

    public EmployeeAddress() {
        this.staffId = EmployeeAddressBuilder.staffId;
        this.address = EmployeeAddressBuilder.address;
    }

    public EmployeeAddress(EmployeeAddressBuilder builder){
        this.staffId = EmployeeAddressBuilder.staffId;
        this.address = EmployeeAddressBuilder.address;
    }

    @Id
    @Column(name="staffId")
    public String getStaffId() {
        return staffId;
    }

    @Column(name="address")
    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "EmployeeAddress{" +
                "staffId='" + staffId + '\'' +
                ", address=" + address +
                '}';
    }

    public static class EmployeeAddressBuilder{
        public static String staffId;
        public static Address address;

        public EmployeeAddressBuilder(){
            this.staffId = staffId;
            this.address = address;
        }

        public EmployeeAddressBuilder createStaffId(String staffId){
            this.staffId = staffId;
            return this;
        }

        public EmployeeAddressBuilder createAddress(Address address){
            this.address = address;
            return this;
        }

        public EmployeeAddress build(){
            //validation
            if(this.staffId.equals(null)){
                throw new IllegalArgumentException("Staff Id should not be null.");
            }if(address.equals(null)){
                throw new IllegalArgumentException("Address object should not be null.");
            }

            return new EmployeeAddress(this);
        }
    }
}
