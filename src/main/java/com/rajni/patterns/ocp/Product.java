package com.rajni.patterns.ocp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@Builder
@ToString
public class Product {
    private String name;
    private Color color;
    private Size size;
}
