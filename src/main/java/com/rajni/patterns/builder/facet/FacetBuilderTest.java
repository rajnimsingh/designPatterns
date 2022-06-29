package com.rajni.patterns.builder.facet;

public class FacetBuilderTest {
    public static void main(String[] args) {
        Person person = new PersonBuilder()
                .personalDetails()
                    .name("Rajni")
                    .age(28)
                    .dateOfBirth("24-SEP-1993")
                .lives()
                    .city("Ludhiana")
                    .state("Punjab")
                    .country("India")
                    .street("Street 1")
                    .zipCode("141003")
                .worksAt()
                    .company("Citicorp Services India Private Limited")
                    .position("Assistant Vice President - AVP")
                    .annualIncome(30000000.0)
                .build();

        System.out.println(person);
    }
}
