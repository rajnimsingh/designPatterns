package com.rajni.patterns.factory.abstractfactory;

import org.javatuples.Pair;

import java.lang.reflect.ReflectPermission;
import java.util.ArrayList;
import java.util.List;

public class HotDrinkMachine {
    private List<Pair<String, HotDrinkFactory>> types = new ArrayList<>();

    public HotDrinkMachine() {
        types.add(new Pair<>(CoffeeFactory.class.getSimpleName(), new CoffeeFactory()));
        types.add(new Pair<>(TeaFactory.class.getSimpleName(), new TeaFactory()));
    }

    public static void main(String[] args) {
        HotDrinkMachine machine = new HotDrinkMachine();
        String value0 = machine.types.get(0).getValue0();
        HotDrinkFactory value1 = machine.types.get(0).getValue1();

        System.out.println(value0);
        value1.prepare(10);
    }
}
