package com.rajni.patterns.builder.facet;

public class PersonPersonalDetailsBuilder extends PersonBuilder {
    public PersonPersonalDetailsBuilder(Person person) {
        this.person = person;
    }

    public PersonPersonalDetailsBuilder name(String name) {
        this.person.name = name;
        return this;
    }

    public PersonPersonalDetailsBuilder age(int age) {
        this.person.age = age;
        return this;
    }

    public PersonPersonalDetailsBuilder dateOfBirth(String dateOfBirth) {
        this.person.dateOfBirth = dateOfBirth;
        return this;
    }
}
