package com.rajni.patterns.singleton;

import java.io.Serializable;

public class BasicSingleton implements Serializable {
    private static final BasicSingleton INSTANCE = new BasicSingleton();
    private int value;

    private BasicSingleton() {
        System.out.println("BasicSingleton Instance created.");
    }

    public static BasicSingleton getInstance() {
        return INSTANCE;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
