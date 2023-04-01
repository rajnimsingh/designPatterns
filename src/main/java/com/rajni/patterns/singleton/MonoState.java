package com.rajni.patterns.singleton;

import lombok.ToString;

@ToString
public class MonoState {
    private static String name;
    private static int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        MonoState.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        MonoState.age = age;
    }

    public String toString() {
        return " {name = " + name + " , age = "+age+"}";
    }

    public static void main(String[] args) {
        MonoState monoState = new MonoState();
        monoState.setAge(22);
        monoState.setName("Rajni");

        System.out.println(monoState);

        MonoState secondObject = new MonoState();
        System.out.println(secondObject);
    }
}
