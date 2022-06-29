package com.rajni.patterns.builder.facet;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Person {
    // personal details
    protected String name;
    protected int age;
    protected String dateOfBirth;
    // address details
    protected String streetAddress;
    protected String city;
    protected String state;
    protected String country;
    protected String zipCode;

    // work details
    protected String companyName;
    protected String position;
    protected double annualIncome;
}
