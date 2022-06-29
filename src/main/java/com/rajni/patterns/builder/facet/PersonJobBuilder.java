package com.rajni.patterns.builder.facet;

public class PersonJobBuilder extends PersonBuilder {

    public PersonJobBuilder(Person person) {
        this.person = person;
    }

    public PersonJobBuilder company(String company) {
        person.companyName = company;
        return this;
    }

    public PersonJobBuilder position(String position) {
        person.position = position;
        return this;
    }

    public PersonJobBuilder annualIncome(double annualIncome) {
        person.annualIncome = annualIncome;
        return this;
    }
}
