package za.ac.cput.Domain.Entities;

import org.jetbrains.annotations.NotNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

/**
 * Joshua Julies
 * 220102473
 * ----------
 * Question 1
 */

@Entity(name = "Address")
public class Address {
    @Column(nullable = false)
    @NotNull
    private final String unitNumber, complexName, streetNumber, streetName;
    @Column(nullable = false)
    @NotNull
    private final int postalCode;
    @Column(nullable = false)
    @NotNull
    private final City city;

    //composite key with mandatory attributes
    @Id
    @Column(nullable = false, unique = true)
    @NotNull
    private String compositeId;

    public Address() {
        this.unitNumber = AddressBuilder.unitNumber;
        this.complexName = AddressBuilder.complexName;
        this.streetNumber = AddressBuilder.streetNumber;
        this.streetName = AddressBuilder.streetName;
        this.postalCode = AddressBuilder.postalCode;
        this.city = AddressBuilder.city;

        this.compositeId = streetNumber + streetName + postalCode;// + city.toString();
    }

    public Address(AddressBuilder builder){
        this.unitNumber = AddressBuilder.unitNumber;
        this.complexName = AddressBuilder.complexName;
        this.streetNumber = AddressBuilder.streetNumber;
        this.streetName = AddressBuilder.streetName;
        this.postalCode = AddressBuilder.postalCode;
        this.city = AddressBuilder.city;

        this.compositeId = streetNumber + streetName + postalCode;// + city.toString();
    }

    public String getUnitNumber() {
        return unitNumber;
    }

    public String getComplexName() {
        return complexName;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public City getCity() {
        return city;
    }

    @Id
    public String getCompositeId(){
        return compositeId = streetNumber + streetName + postalCode;// + city.toString();
    }

    @Override
    public String toString() {
        return "Address{" +
                ", unitNumber='" + unitNumber + '\'' +
                ", complexName='" + complexName + '\'' +
                ", streetNumber='" + streetNumber + '\'' +
                ", streetName='" + streetName + '\'' +
                ", postalCode=" + postalCode +
                ", city=" + city +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        //return super.equals(obj);
        if (this == obj){
            return true;
        }
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }

        Address address = (Address) obj;

        //use of recursion
        return Objects.equals(unitNumber, address.unitNumber)
                && Objects.equals(complexName, address.complexName)
                && Objects.equals(streetNumber, address.streetNumber)
                && Objects.equals(streetName, address.streetName)
                && Objects.equals(postalCode, address.postalCode)
                && Objects.equals(city, address.city);
    }

    @Override
    public int hashCode() {
        //return super.hashCode();
        return Objects.hash(unitNumber, complexName, streetNumber, streetName, postalCode, city);
    }

    public static class AddressBuilder{
        public static String unitNumber, complexName, streetNumber, streetName;
        public static int postalCode;
        public static City city;

        public AddressBuilder(){
            this.unitNumber = unitNumber;
            this.complexName = complexName;
            this.streetNumber = streetNumber;
            this.streetName = streetName;
            this.postalCode = postalCode;
            this.city = city;
        }

        public AddressBuilder createUnitNumber(String unitNumber){
            this.unitNumber = unitNumber;
            return this;
        }

        public AddressBuilder createComplexName(String complexName){
            this.complexName = complexName;
            return this;
        }

        public AddressBuilder createStreetNumber(String streetNumber){
            this.streetNumber = streetNumber;
            return this;
        }

        public AddressBuilder createStreetName(String streetName){
            this.streetName = streetName;
            return this;
        }

        public AddressBuilder createPostalCode(int postalCode){
            this.postalCode = postalCode;
            return this;
        }

        public AddressBuilder createCity(City city){
            this.city = city;
            return this;
        }

        public Address build(){
            //validation
            if(this.unitNumber.equals(null)){
                throw new IllegalArgumentException("Unit Number should not be null.");
            }if(this.complexName.equals(null)){
                throw new IllegalArgumentException("The Complex Name should not be null.");
            }if(this.streetNumber.equals(null)){
                throw new IllegalArgumentException("Street Number should not be null.");
            }if(this.streetName.equals(null)){
                throw new IllegalArgumentException("Street Name should not be null.");
            }if(this.postalCode < 1000 || this.postalCode > 9999 ){
                throw new IllegalArgumentException("Postal Code should not be smaller than 1000 and larger than 9999.");
            }/**if(this.city.equals(null)){
                throw new IllegalArgumentException("City object should not be null.");
            }**/

            return new Address(this);
        }
    }
}
