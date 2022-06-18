package za.ac.cput.Domain.Entities;

import javax.persistence.Embedded;

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

    @Embedded
    private Name name;

    private Student(StudentBuilder builder){
        this.studentID = builder.studentID;
        this.email = builder.email;
        this.name = builder.name;
    }

    public String setStudentID(String studentID) {
        this.studentID = studentID;
        return studentID;
    }

    public String setEmail(String email) {
        this.email = email;
        return email;
    }

    public Name setName(Name name) {
        this.name = name;
        return name;
    }

    public String getStudentID() {
        return studentID;
    }
    public String getName() {
        return studentID;
    }

    @Override
    public String toString() {
        return "StudentRepositoryImpl{" +
                "studentID='" + studentID + '\'' +
                ", email='" + email + '\'' +
                ", name=" + name +
                '}';
    }


   public static class StudentBuilder {
       private String studentID;
       private String email;
       private Name name;

       public StudentBuilder setStudentID(String studentID) {
           this.studentID = studentID;
           return this;
       }

       public StudentBuilder() {
           this.studentID = studentID;
           this.email = email;
           this.name = name;
       }


       public StudentBuilder setEmail(String email) {
           this.email = email;
           return this;
       }

       public StudentBuilder setName(Name name) {
           this.name = name;
           return this;
       }

       public Student copy(Student student){
           this.studentID = student.studentID;
           this.email = student.email;
           this.name = student.name;
           return student;
       }

       public Student builder(){
           if (name.equals(null)) {
               throw new IllegalArgumentException("Address cannot be null");
           }
       return new Student(this);}

   }






}
