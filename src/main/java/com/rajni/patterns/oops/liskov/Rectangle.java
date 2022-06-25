package com.rajni.patterns.oops.liskov;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Rectangle {
    private int height;
    private int width;

    public int area() {
        return height * width;
    }

}
