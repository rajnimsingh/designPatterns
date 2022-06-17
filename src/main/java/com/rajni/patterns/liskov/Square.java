package com.rajni.patterns.liskov;

import lombok.Builder;

public class Square extends Rectangle {

    public Square(int side) {
        super.setHeight(side);
        super.setWidth(side);
    }
    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(height);
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }
}
