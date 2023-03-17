package com.rajni.patterns.proxy.cloneable;

public class CloneTest {
    public static void main(String[] args) {
        Person rajni = Person.builder()
                .name(new String[] {"Rajni", "Ubhi"})
                .address(Address.builder()
                        .streetName("1")
                        .postalCode("141003")
                        .country("India")
                        .houseNumber(1233)
                        .state("Punjab")
                        .streetName("London Street")
                        .build())
                .build();

        Person newRajni = rajni.clone();

        newRajni.getAddress().setCountry("London");
        newRajni.getAddress().setHouseNumber(1234);
        System.out.println(rajni);
        System.out.println(newRajni);
    }
}
