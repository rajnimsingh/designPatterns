package com.rajni.patterns.isp;

public class JustAPrinter implements Printer {
    @Override
    public void print(Document document) {
        System.out.println("printing the document: " + document);
    }
}
