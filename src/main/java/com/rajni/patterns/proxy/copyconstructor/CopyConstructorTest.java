package com.rajni.patterns.proxy.copyconstructor;

public class CopyConstructorTest {
    public static void main(String[] args) {
        Employee employee = new Employee("Rajni", new Address("Pune", "ABC", "Maharashtra"));

        Employee newEmployee = new Employee(employee);
        newEmployee.getAddress().setCity("New Name");

        System.out.println(employee);
        System.out.println(newEmployee);
    }
}
