package com.rajni.patterns.builder;

public class StringBuilderDemo {
    public static void main(String[] args) {
        String[] words = {"Hello", "Rajni", "This", "Is", "Builder", "Example", "Using", "StringBuilder"};
        StringBuilder builder = new StringBuilder();
        builder.append("<ul>\n");
        for (String word : words) {
            builder.append("\t<li> ").append(word).append(" </li>\n");
        }
        builder.append("<ul>");
        System.out.println(builder);
    }
}
