package com.rajni.patterns.factory.nestedclass;

import lombok.Data;

@Data
public class Point {
    private double x, y;

    private Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static class Factory {
        public static Point newCartesianPoint(double x, double y) {
            return new Point(x, y);
        }
        public static Point newPolarPoint(double x, double y) {
            return new Point(x * Math.cos(y), x * Math.sin(y));
        }
    }
}
