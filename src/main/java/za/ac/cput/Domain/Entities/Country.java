package za.ac.cput.Domain.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * Delron Chad Claassen - 219360561
 * Country Entity class
 * ++++++++++++++++++++++++++++++++
 *           Question 1
 * ++++++++++++++++++++++++++++++++
 *
 */

@Entity
@Table(name="Country")
public class Country {

    @Id
    @Column(nullable = false)
    private String countryID;
    @Column(nullable = false)
    private String countryName;

    public Country(){}

    public Country(CountryBuilder builder) {
        this.countryID = builder.countryID;
        this.countryName = builder.countryName;
    }

    @Column(name="countryId")
    public String getCountryID() {
        return countryID;
    }

    @Column(name="countryName")
    public String getCountryName() {
        return countryName;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryID='" + countryID + '\'' +
                ", countryName='" + countryName +
                '}';
    }

    public static class CountryBuilder {

        private String countryID;
        private String countryName;

        public CountryBuilder setCountryID(String countryID) {
            this.countryID = countryID;
            return this;
        }

        public CountryBuilder setCountryName(String countryName) {
            this.countryName = countryName;
            return this;
        }

        public CountryBuilder copy(Country country) {
            this.countryID = country.countryID;
            this.countryName = country.countryName;

            return this;
        }

        public Country build() {
            return new Country(this);
        }

    }
}
