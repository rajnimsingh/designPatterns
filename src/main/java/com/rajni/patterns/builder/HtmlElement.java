package com.rajni.patterns.builder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HtmlElement {
    String name;
    String text;
    List<HtmlElement> children = new ArrayList<>();
    private final int indent = 2;
    private final String newLine = System.lineSeparator();

    public HtmlElement() {

    }
    public HtmlElement(String name, String text) {
        this.name = name;
        this.text = text;
    }

    private String toStringImpl(int indent) {
        StringBuilder builder = new StringBuilder();
        String i = String.join("", Collections.nCopies(indent * this.indent, " "));
        builder.append(String.format("%s<%s>%s", i, name, newLine));

        if(text != null && !text.isEmpty()) {
            builder.append(String.join("", Collections.nCopies(this.indent * (indent + 1), " ")))
                    .append(text)
                    .append(newLine);
        }

        for (HtmlElement element : children) {
            builder.append(element.toStringImpl(indent + 1));
        }

        builder.append(String.format("%s</%s>%s", i, name, newLine));
        return builder.toString();
    }

    @Override
    public String toString() {
        return toStringImpl(0);
    }

}
