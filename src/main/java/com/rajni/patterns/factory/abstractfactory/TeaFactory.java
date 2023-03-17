package com.rajni.patterns.factory.abstractfactory;

public class TeaFactory implements HotDrinkFactory {
    @Override
    public HotDrink prepare(int amount) {
        System.out.println("Put in Tea bags, boil water, pour " + amount + " ml, add lemon and enjoy !!");
        return new Tea();
    }
}
