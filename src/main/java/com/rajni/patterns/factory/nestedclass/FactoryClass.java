package com.rajni.patterns.factory.nestedclass;

public class FactoryClass {
    public static void main(String[] args) {
        Point point = Point.Factory.newCartesianPoint(10.0, 8.0);
        System.out.println(point);

        point = Point.Factory.newPolarPoint(10.0, 8.0);
        System.out.println(point);
    }
}
