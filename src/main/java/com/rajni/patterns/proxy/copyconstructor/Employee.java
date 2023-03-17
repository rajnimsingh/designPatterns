package com.rajni.patterns.proxy.copyconstructor;

import lombok.Data;

@Data
public class Employee {
    private String name;
    private Address address;

    public Employee(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Employee(Employee employee) {
        this.name = employee.name;
        this.address = new Address(employee.address);
    }
}
