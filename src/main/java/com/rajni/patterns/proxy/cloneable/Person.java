package com.rajni.patterns.proxy.cloneable;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class Person implements Cloneable, Serializable {
    private String[] name;
    private Address address;

    @Override
    public Person clone() {
        Person clone;
        clone = Person.builder()
                .address(address.clone())
                .name(name.clone())
                .build();
        return clone;
    }
}
