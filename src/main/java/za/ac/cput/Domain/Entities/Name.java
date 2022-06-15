package za.ac.cput.Domain.Entities;

import java.util.Objects;

/**
 * Matthew Jones
 * 220077681
 * Question 1
 */

public class Name
{
    private String firstName;
    private String middleName;
    private String lastName;

    public Name(NameBuilder builder)
    {
        this.firstName = builder.firstName;
        this.middleName = builder.middleName;
        this.lastName = builder.lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Name{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj){
            return true;
        }
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }

        Name name = (Name) obj;

        return Objects.equals(firstName, name.firstName)
                && Objects.equals(middleName, name.middleName)
                && Objects.equals(lastName, name.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, middleName, lastName);
    }

    public static class NameBuilder
    {
        public String firstName;
        public String middleName;
        public String lastName;

        public NameBuilder() {

            if (this.firstName.equals(null)) {
                throw new IllegalArgumentException("First Name shouldn't be null.");
            }
            if (this.middleName.equals(null)) {
                throw new IllegalArgumentException("Middle Name shouldn't be null");
            }
            if (this.lastName.equals(null)) {
                throw new IllegalArgumentException("Last Name shouldn't be null.");
            }
        }

        public NameBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public NameBuilder setMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public NameBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Name build()
        {
            return new Name(this);
        }
    }
}
