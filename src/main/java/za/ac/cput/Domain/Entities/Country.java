package za.ac.cput.Domain.Entities;

/**
 *
 * Delron Chad Claassen - 219360561
 * Country Entity class.
 * ++++++++++++++++
 * Question 1
 *
 */

public class Country {

    private String countryID;
    private String countryName;

    public Country(){};

    public Country(CountryBuilder builder) {
        this.countryID = builder.countryID;
        this.countryName = builder.countryName;
    }

    public String getCountryID() {
        return countryID;
    }

    public void setCountryId(String countryID) {
        this.countryID = countryID;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
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
