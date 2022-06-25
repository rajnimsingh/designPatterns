package com.rajni.patterns.builder.fluent;

public class PersonBuilder<SELF extends PersonBuilder<SELF>> {
    Person person = new Person();
    public SELF withName(String name) {
        person.name = name;
        return self();
    }

    public Person build() {
        return person;
    }

    public SELF self() {
        return (SELF) this;
    }
}