package za.ac.cput.Domain.Entities;

import javax.persistence.*;
import javax.persistence.Id;

/**
 * Matthew Jones
 * 220077681
 * Question 1
 */

@Entity(name = "Employee")
public class Employee
{
    @Column(nullable = false, unique = true)
    @Id
    private final String staffId;
    @Column(nullable = false)
    private final String email;
    @Column(nullable = false)
    private final Name name;

    public Employee()
    {
        this.staffId = EmployeeBuilder.staffId;
        this.email = EmployeeBuilder.email;
        this.name = EmployeeBuilder.name;
    }

    public Employee(EmployeeBuilder builder)
    {
        this.staffId = builder.staffId;
        this.email = builder.email;
        this.name = builder.name;
    }

    @Column(name = "staffId")
    public String getStaffId() {
        return staffId;
    }

    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    @Column(name = "name")
    public Name getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "staffId='" + staffId + '\'' +
                ", email='" + email + '\'' +
                ", name=" + name +
                '}';
    }

    public static class EmployeeBuilder
    {
        public static String staffId;
        public static String email;
        public static Name name;

        public EmployeeBuilder() {
            this.staffId = staffId;
            this.email = email;
            this.name = name;
        }

        public EmployeeBuilder setStaffId(String staffId) {
            this.staffId = staffId;
            return this;
        }

        public EmployeeBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public EmployeeBuilder setName(Name name) {
            this.name = name;
            return this;
        }

        public EmployeeBuilder copy(Employee employee)
        {
            this.staffId = employee.staffId;
            this.email = employee.email;
            this.name = employee.name;

            return this;
        }

        public Employee build()
        {
            if (this.staffId.equals(null)) {
                throw new IllegalArgumentException("Staff ID shouldn't be null.");
            }
            if (this.email.equals(null)) {
                throw new IllegalArgumentException("Email shouldn't be null");
            }
            if (this.name.equals(null)) {
                throw new IllegalArgumentException("Name shouldn't be null.");
            }

            return new Employee(this);
        }
    }
}
