package com.rajni.patterns.builder.fluent;

public class EmployerBuilder extends PersonBuilder<EmployerBuilder> {
    public EmployerBuilder worksAt(String company) {
        person.company = company;
        return this;
    }

    @Override
    public EmployerBuilder self() {
        return this;
    }
}