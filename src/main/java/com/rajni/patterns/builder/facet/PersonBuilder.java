package com.rajni.patterns.builder.facet;

public class PersonBuilder {
    protected Person person = new Person();

    public PersonPersonalDetailsBuilder personalDetails() {
        return new PersonPersonalDetailsBuilder(person);
    }

    public PersonAddressBuilder lives() {
        return new PersonAddressBuilder(person);
    }

    public PersonJobBuilder worksAt() {
        return new PersonJobBuilder(person);
    }
    public Person build() {
        return this.person;
    }
}
