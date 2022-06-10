package za.ac.cput.Domain.Entities;

import java.util.Objects;

/**
 * Joshua Julies
 * 220102473
 * ----------
 * Question 1
 */

public class EmployeeAddress {
    private final String staffId;
    private final Address address;

    public EmployeeAddress(EmployeeAddressBuilder builder){
        this.staffId = EmployeeAddressBuilder.staffId;
        this.address = EmployeeAddressBuilder.address;
    }

    public String getStaffId() {
        return staffId;
    }

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
            //validation
            if(this.staffId.equals(null)){
                throw new IllegalArgumentException("Staff Id should not be null.");
            }if(address.equals(null)){
                throw new IllegalArgumentException("Address object should not be null.");
            }

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
            return new EmployeeAddress(this);
        }
    }
}
