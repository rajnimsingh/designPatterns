package com.rajni.patterns.oops.di;

public class DependencyInversionDemo {
    public static void main(String[] args) {
        Person personOne = Person.builder().name("Johnny").age(54).build();
        Person personTwo = Person.builder().name("Jimmy").age(20).build();

        Person personThree = Person.builder().name("ABC").age(12).build();
        Person personFour = Person.builder().name("DEF").age(23).build();

        Relationships relationships = new Relationships();
        relationships.addParentAndChild(personOne, personTwo);
        relationships.addParentAndChild(personOne, personThree);

        Research research = new Research(relationships);
        research.findChildren("Johnny");
        research.findChildren("ABC");
    }
}
