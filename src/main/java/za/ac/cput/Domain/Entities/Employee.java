package za.ac.cput.Domain.Entities;

/**
 * Matthew Jones
 * 220077681
 * Question 1
 */

public class Employee
{
    private String staffId;
    private String email;
    private Name name;

    public Employee(EmployeeBuilder builder)
    {
        this.staffId = builder.staffId;
        this.email = builder.email;
        this.name = builder.name;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
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
        public String staffId;
        public String email;
        public Name name;

        public EmployeeBuilder() {

            if (this.staffId.equals(null)) {
                throw new IllegalArgumentException("Staff ID shouldn't be null.");
            }
            if (this.email.equals(null)) {
                throw new IllegalArgumentException("Email shouldn't be null");
            }
            if (this.name.equals(null)) {
                throw new IllegalArgumentException("Name shouldn't be null.");
            }
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

        public Employee build()
        {
            return new Employee(this);
        }
    }
}
