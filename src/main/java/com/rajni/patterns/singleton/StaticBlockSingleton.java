package com.rajni.patterns.singleton;

import java.io.File;
import java.io.IOException;

public class StaticBlockSingleton {
    private static StaticBlockSingleton instance;

    /**
     *  When constructor throws Exception then use static block initialization
     */
    private StaticBlockSingleton() throws IOException {
        System.out.println("Initializing static block");
        File file = File.createTempFile(".", ".");
        System.out.println("File has been created. " + file.getName());
    }

    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        StaticBlockSingleton blockSingleton = StaticBlockSingleton.getInstance();
        System.out.println(blockSingleton);
    }
}
