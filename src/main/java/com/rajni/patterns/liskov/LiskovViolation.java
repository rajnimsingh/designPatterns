package com.rajni.patterns.liskov;

public class LiskovViolation {
    public static void useIt(Rectangle rectangle) {
        int width = rectangle.getWidth();
        rectangle.setHeight(10);

        System.out.println("Expected "+ (width * 10) + " and got "+ rectangle.area());
    }

    public static void main(String[] args) {
        useIt(Rectangle.builder().height(10).width(5).build());
        useIt(Rectangle.builder().height(10).width(10).build());
        useIt(Rectangle.builder().height(20).width(5).build());

        Square sq = new Square(5);
        useIt(sq);
    }
}
