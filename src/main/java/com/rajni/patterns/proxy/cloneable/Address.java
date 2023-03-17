package com.rajni.patterns.proxy.cloneable;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class Address implements  Cloneable, Serializable {
    private int houseNumber;
    private String streetName;
    private String state;
    private String country;
    private String postalCode;

    @Override
    public Address clone() {
        return Address.builder()
                .houseNumber(houseNumber)
                .country(country)
                .postalCode(postalCode)
                .streetName(streetName)
                .state(state)
                .build();
    }
}
