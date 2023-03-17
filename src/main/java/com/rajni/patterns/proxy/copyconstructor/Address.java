package com.rajni.patterns.proxy.copyconstructor;

import lombok.Data;

@Data
public class Address {
    private String city;
    private String streetName;
    private String state;

    public Address(String city, String streetName, String state) {
        this.city = city;
        this.streetName = streetName;
        this.state = state;
    }

    public Address(Address address) {
        this.city = address.city;
        this.streetName = address.streetName;
        this.state = address.state;
    }
}
