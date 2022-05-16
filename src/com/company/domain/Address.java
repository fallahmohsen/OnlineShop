package com.company.domain;

public class Address {
    private int id;
    private String homeAddress;
    private String state;
    private String city;
    private String streetName;
    private int postalCode;

    public Address() {
    }

    public Address(int id, String homeAddress, String state, String city, String streetName, int postalCode) {
        this.id = id;
        this.homeAddress = homeAddress;
        this.state = state;
        this.city = city;
        this.streetName = streetName;
        this.postalCode = postalCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }
}


