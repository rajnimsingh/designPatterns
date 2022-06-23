package com.rajni.patterns.isp;

public class MultiFunctionMachine implements MultiFunctionDevice {
    @Override
    public void fax(Document document) {
        System.out.println("MultiFunction Machine faxing the document - " + document);
    }

    @Override
    public void print(Document document) {
        System.out.println("MultiFunction Machine printing the document - " + document);
    }

    @Override
    public void scan(Document document) {
        System.out.println("MultiFunction Machine scanning the document - " + document);
    }
}
