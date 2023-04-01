package com.rajni.patterns.singleton;

import java.io.*;

public enum EnumBasedSingleton {
    INSTANCE;
    private int value;
    EnumBasedSingleton() {
        value = 42;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

class Demo {
    static void writeToFile(EnumBasedSingleton singleton , String fileName) throws IOException {
        try (FileOutputStream fout = new FileOutputStream(fileName)) {
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(singleton);
        }
    }

    static EnumBasedSingleton readFromFile(String fileName) throws IOException, ClassNotFoundException {
        try (FileInputStream fin = new FileInputStream(fileName)) {
            ObjectInputStream oin = new ObjectInputStream(fin);
            return (EnumBasedSingleton) oin.readObject();
        }
    }
    public static void main(String[] args) throws Exception {
        EnumBasedSingleton singleton = EnumBasedSingleton.INSTANCE;
        singleton.setValue(111);

        String fileName = "enumObject.bin";

        writeToFile(singleton, fileName);

        EnumBasedSingleton deserializedInstance = readFromFile(fileName);
        System.out.println(deserializedInstance.getValue());
    }
}
