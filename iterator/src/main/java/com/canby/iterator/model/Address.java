package com.canby.iterator.model;

/**
 * Created by acanby on 8/10/2014.
 */
public class Address {
    Integer streetNumber;
    String street;
    String suburb;
    String country;
    Integer postcode;

    public Address(Integer streetNumber, String street, String suburb, String country, Integer postcode) {
        this.streetNumber = streetNumber;
        this.street = street;
        this.suburb = suburb;
        this.country = country;
        this.postcode = postcode;
    }

    public Integer getStreetNumber() {
        return streetNumber;
    }

    public String getStreet() {
        return street;
    }

    public String getSuburb() {
        return suburb;
    }

    public String getCountry() {
        return country;
    }

    public Integer getPostcode() {
        return postcode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetNumber=" + streetNumber +
                ", street='" + street + '\'' +
                ", suburb='" + suburb + '\'' +
                ", country='" + country + '\'' +
                ", postcode=" + postcode +
                '}';
    }
}