package com.rajni.patterns.singleton;

import java.util.HashMap;
import java.util.Map;

public class Multiton {
    public static void main(String[] args) {
        Printer firstPrinter = Printer.getInstance(SubSystems.PRIMARY);
        Printer secondPrinter = Printer.getInstance(SubSystems.PRIMARY);
        Printer thirdPrinter = Printer.getInstance(SubSystems.FALLBACK);
        Printer fourthPrinter = Printer.getInstance(SubSystems.SECONDARY);
        System.out.println(firstPrinter);
        System.out.println(secondPrinter);
        System.out.println(thirdPrinter);
        System.out.println(fourthPrinter);
    }
}

enum SubSystems {
    PRIMARY,
    SECONDARY,
    FALLBACK
}

class Printer {
    private static int instanceCount = 0;
    private static Map<SubSystems, Printer> subSystemsMap = new HashMap<>();

    private Printer() {
        instanceCount++;
        System.out.println("Number of instances created :: "+instanceCount);
    }

    public static Printer getInstance(SubSystems ss) {
        if (subSystemsMap.containsKey(ss)) {
            return subSystemsMap.get(ss);
        }

        Printer printer = new Printer();
        subSystemsMap.put(ss, printer);
        return printer;
    }



}
