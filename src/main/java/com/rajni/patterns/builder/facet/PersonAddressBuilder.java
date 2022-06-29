package com.rajni.patterns.builder.facet;

public class PersonAddressBuilder extends PersonBuilder {

    public PersonAddressBuilder(Person person) {
        this.person = person;
    }

    public PersonAddressBuilder street(String street) {
        person.streetAddress = street;
        return this;
    }

    public PersonAddressBuilder city(String city) {
        person.city = city;
        return this;
    }

    public PersonAddressBuilder state(String state) {
        person.state = state;
        return this;
    }

    public PersonAddressBuilder country(String country) {
        person.country = country;
        return this;
    }

    public PersonAddressBuilder zipCode(String zipCode) {
        person.zipCode = zipCode;
        return this;
    }
}
