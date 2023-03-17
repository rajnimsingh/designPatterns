package com.rajni.patterns.factory.abstractfactory;

public class CoffeeFactory implements HotDrinkFactory {
    @Override
    public HotDrink prepare(int amount) {
        System.out.println("Grind beans, boil water, pour " + amount + " ml, and enjoy !!");
        return new Coffee();
    }
}
