package com.rajni.patterns.isp;

public class InterfaceSegregationPrincipleDemo {
    public static void main(String[] args) {
        Document document = Document.builder()
                .title("Java Design Patterns")
                .description("This project explains all the OOPS principles and Design Patterns")
                .build();

        MultiFunctionDevice multiFunctionDevice = new MultiFunctionMachine();
        multiFunctionDevice.scan(document);
        multiFunctionDevice.print(document);
        multiFunctionDevice.fax(document);

    }
}
