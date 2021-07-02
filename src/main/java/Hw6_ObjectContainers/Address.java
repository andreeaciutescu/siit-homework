package Hw6_ObjectContainers;

public class Address {
    String street;
    String town;
    String country;

    public String getStreet() {
        return street;
    }

    public String getTown() {
        return town;
    }

    public String getCountry() {
        return country;
    }

    public Address(String street, String town, String country) {
        this.street = street;
        this.town = town;
        this.country = country;


    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", town='" + town + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}

