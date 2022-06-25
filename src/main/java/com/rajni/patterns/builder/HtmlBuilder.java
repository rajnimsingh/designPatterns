package com.rajni.patterns.builder;

public class HtmlBuilder {
    private final String rootName;
    private HtmlElement root = new HtmlElement();

    public HtmlBuilder(String rootName) {
        this.rootName = rootName;
        root.name = rootName;
    }

    public HtmlBuilder addChild(String childName, String childText) {
        root.children.add(new HtmlElement(childName, childText));
        return this;
    }

    public void clear() {
        this.root = new HtmlElement();
        root.name = rootName;
    }

    @Override
    public String toString() {
        return root.toString();
    }

    public static void main(String[] args) {
        HtmlBuilder builder = new HtmlBuilder("ul");
        builder.addChild("li", "Hello").addChild("li", "Rajni");
        System.out.println(builder);
    }
}
