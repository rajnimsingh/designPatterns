package com.rajni.patterns.builder.fluent;

public class FluentBuilderDemo {
    public static void main(String[] args) {
        EmployerBuilder personBuilder = new EmployerBuilder();
        final Person person = personBuilder.withName("Rajni").worksAt("Java Developer").build();
        System.out.println(person);
    }
}
