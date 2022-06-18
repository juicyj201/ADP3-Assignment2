package za.ac.cput.Domain.Entities;

/**
 *
 * Keziah Robinson
 * 219113149
 * StudentAddress Entity
 *
 */

public class StudentAddress {
    private String studentID;
    private Address address;

    private StudentAddress(StudentAddressBuilder builder){
        this.studentID = builder.studentID;
        this.address = builder.address;
    }

    public String setStudentID(String studentID) {
        this.studentID = studentID;
        return studentID;
    }

    public Address setAddress(Address address) {
        this.address = address;
        return address;
    }

    public String getStudentID() {
        return studentID;
    }

    @Override
    public String toString() {
        return "StudentAddress{" +
                "studentID='" + studentID + '\'' +
                ", address=" + address +
                '}';
    }


    public static class StudentAddressBuilder {
        private String studentID;
        private Address address;

        public StudentAddressBuilder setStudentID(String studentID) {
            this.studentID = studentID;
            return this;
        }

        public StudentAddressBuilder setAddress(Address address) {
            this.address = address;
            return this;
        }

        public StudentAddress copy(StudentAddress studentAddress){
            this.studentID = studentAddress.studentID;
            this.address = studentAddress.address;
            return studentAddress;
        }

        public StudentAddress builder(){return new StudentAddress(this);}
    }
}
