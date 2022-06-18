package za.ac.cput.Domain.Entities;

import java.util.Objects;
import javax.persistence.*;
import javax.persistence.Id;

/**
 * Matthew Jones
 * 220077681
 * Question 1
 */

@Entity(name = "Name")
public class Name
{
    @Column(nullable = false)
    private final String firstName;
    @Column(nullable = false)
    private final String middleName;
    @Column(nullable = false)
    private final String lastName;

    @Id
    @Column(nullable = false, unique = true)
    private final String compositeId;

    public Name()
    {
        this.firstName = NameBuilder.firstName;
        this.lastName = NameBuilder.lastName;
        this.middleName = NameBuilder.middleName;

        this.compositeId = firstName + lastName;
    }

    public Name(NameBuilder builder)
    {
        this.firstName = builder.firstName;
        this.middleName = builder.middleName;
        this.lastName = builder.lastName;

        this.compositeId = firstName + lastName;
    }

    @Column(name = "firstName")
    public String getFirstName() {
        return firstName;
    }

    @Column(name = "middleName")
    public String getMiddleName() {
        return middleName;
    }

    @Column(name = "lastName")
    public String getLastName() {
        return lastName;
    }

    @Id
    @Column(name = "compositeId")
    public String getCompositeId() {
        return compositeId;
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
        public static String firstName;
        public static String middleName;
        public static String lastName;

        public NameBuilder() {
            this.firstName = firstName;
            this.middleName = middleName;
            this.lastName = lastName;
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

        public NameBuilder copy(Name name)
        {
            this.firstName = name.firstName;
            this.middleName = name.middleName;
            this.lastName = name.lastName;

            return this;
        }

        public Name build()
        {
            if (this.firstName.equals(null)) {
                throw new IllegalArgumentException("First Name shouldn't be null.");
            }
            if (this.middleName.equals(null)) {
                throw new IllegalArgumentException("Middle Name shouldn't be null");
            }
            if (this.lastName.equals(null)) {
                throw new IllegalArgumentException("Last Name shouldn't be null.");
            }

            return new Name(this);
        }
    }
}
