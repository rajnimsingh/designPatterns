package com.rajni.patterns.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BasicSingletonProblemsDemo {
    public static void main(String[] args) throws Exception {
        BasicSingleton basicSingleton = BasicSingleton.getInstance();
        basicSingleton.setValue(111);
        String fileName = "object.ser";
        saveToFile(basicSingleton, fileName);

        BasicSingleton deserializedObject = readFromFile(fileName);
        deserializedObject.setValue(222);
        System.out.println(basicSingleton == deserializedObject);
        System.out.println(basicSingleton.getValue());
        System.out.println(deserializedObject.getValue());
    }

    private static void saveToFile(BasicSingleton basicSingleton, String fileName) throws Exception {
        try (FileOutputStream fout = new FileOutputStream(fileName);
             ObjectOutputStream out = new ObjectOutputStream(fout)) {
            out.writeObject(basicSingleton);
        }
    }

    private static BasicSingleton readFromFile(String fileName) throws Exception {
        try (FileInputStream fin = new FileInputStream(fileName);
             ObjectInputStream oin  = new ObjectInputStream(fin)) {
            return (BasicSingleton) oin.readObject();
        }
    }
}
