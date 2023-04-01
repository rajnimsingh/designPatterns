package com.rajni.patterns.singleton;

public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {
        System.out.println("Initializing instance lazily.");
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        System.out.println(lazySingleton);
    }
}
