package com.rajni.patterns.factory.abstractfactory;

public class Coffee implements HotDrink {
    @Override
    public void consume() {
        System.out.println("This cofee is delicious");
    }
}
