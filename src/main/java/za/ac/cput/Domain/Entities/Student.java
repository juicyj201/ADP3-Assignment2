package za.ac.cput.Domain.Entities;
/**
 *
 * Keziah Robinson
 * 219113149
 * Student Entity
 *
 */
public class Student {
    private String studentID;
    private String email;
    private Address address;

    private Student(StudentBuilder builder){
        this.studentID = builder.studentID;
        this.email = builder.email;
        this.address = builder.address;
    }

    public String setStudentID(String studentID) {
        this.studentID = studentID;
        return studentID;
    }

    public String setEmail(String email) {
        this.email = email;
        return email;
    }

    public Address setAddress(Address address) {
        this.address = address;
        return address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID='" + studentID + '\'' +
                ", email='" + email + '\'' +
                ", address=" + address +
                '}';
    }


   public static class StudentBuilder {
       private String studentID;
       private String email;
       private Address address;
       public StudentBuilder setStudentID(String studentID) {
           this.studentID = studentID;
           return this;
       }

       public StudentBuilder(){
           if (address.equals(null)) {
               throw new IllegalArgumentException("Address cannot be null");}
               this.address = address;}

       public StudentBuilder setEmail(String email) {
           this.email = email;
           return this;
       }

       public StudentBuilder setAddress(Address address) {
           this.address = address;
           return this;
       }

       public Student copy(Student student){
           this.studentID = student.studentID;
           this.email = student.email;
           this.address = student.address;
           return student;
       }

       public Student builder(){ return new Student(this);}

   }






}
