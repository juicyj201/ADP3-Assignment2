package za.ac.cput.Domain.Entities;

/**
 * Delron Chad Claassen - 219360561
 * City Entity
 * ++++++++++++++++
 * Question 1
 */

public class City {

    private String cityID;
    private String cityName;
    private Country country;

    public City(){};

    public City(CityBuilder builder) {
        this.cityID = builder.cityID;
        this.cityName = builder.cityName;
        this.country = builder.country;
    }

    public String setCityId(String ID) {
        this.cityID = cityID;
        return ID;
    }

    public String setCityName(String cityName) {
        this.cityName = cityName;
        return cityName;
    }

    public Country setCountry(Country country) {
        this.country = country;
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
        public String getID() {
            return cityID;
        }

        public CityBuilder setID(String ID) {
            this.cityID = ID;
            return this;
        }

        public CityBuilder setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }

        public String getCityName() {
            return cityName;
        }

        public Country getCountry() {
            return country;
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
