package com.rajni.patterns.factory.method;

public class FactoryMethod {
    public static void main(String[] args) {
        Point point = Point.newCartesianPoint(10.0, 8.0);
        System.out.println(point);

        point = Point.newPolarPoint(10.0, 8.0);
        System.out.println(point);
    }
}
