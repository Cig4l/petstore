package org.petstore.entities;

import jakarta.persistence.*;

@Embeddable
public class Address {
    @Column(name = "number")
    private String number;

    @Column(name = "street")
    private String street;

    @Column(name = "zipCode")
    private String zipcode;

    @Column(name = "city")
    private String city;

    public Address(){}

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}
