package com.rajni.patterns.oops.di;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Person {
    private String name;
    private int age;
}
