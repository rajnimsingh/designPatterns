package com.rajni.patterns.singleton;

public class InnerStaticSingleton {
    private InnerStaticSingleton() {
        System.out.println("Inner static singleton initialized..");
    }

    private static class Impl {
        private static final InnerStaticSingleton INSTANCE = new InnerStaticSingleton();
    }

    public static InnerStaticSingleton getInstance() {
        return Impl.INSTANCE;
    }

    public static void main(String[] args) {
        InnerStaticSingleton instance = InnerStaticSingleton.getInstance();
        System.out.println(instance);
    }
}
