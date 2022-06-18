package za.ac.cput.Domain.Entities;

import javax.persistence.*;

/**
 * Delron Chad Claassen - 219360561
 * City Entity
 * ++++++++++++++++++++++++++++++++
 *           Question 1
 * ++++++++++++++++++++++++++++++++
 *
 */

@Entity
@Table(name="City")
public class City {

    @Id
    @Column(nullable = false)
    private String cityID;

    @Column(nullable = false)
    private String cityName;
    @Column(nullable = false)
    private Country country;

    public City(){}

    public City(CityBuilder builder) {
        this.cityID = builder.cityID;
        this.cityName = builder.cityName;
        this.country = builder.country;
    }

    @Id
    @Column(name = "cityId")
    public String getCityID() {
        return cityID;
    }

    @Column(name = "cityName")
    public String getCityName() {
        return cityName;
    }

    @Column(name = "country")
    public Country getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "City{" +
                "cityID='" + cityID + '\'' +
                ", cityName='" + cityName + '\'' +
                ", country=" + country +
                '}';
    }

    public static class CityBuilder {

        private String cityID;
        private String cityName;
        private Country country;

        public CityBuilder setID(String ID) {
            this.cityID = ID;
            return this;
        }

        public CityBuilder setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }

        public CityBuilder setCountry(Country country) {
            this.country = country;
            return this;
        }

        public CityBuilder copy(City city) {
            this.cityID = city.cityID;
            this.cityName = city.cityName;
            this.country = city.country;

            return this;
        }

        public City build() {
            return new City(this);
        }

    }

}
