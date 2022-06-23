package com.rajni.patterns.di;

import java.util.List;

public class Research {
    private final RelationshipBrowser relationshipBrowser;

    public Research(RelationshipBrowser relationshipBrowser) {
        this.relationshipBrowser = relationshipBrowser;
    }

    public void findChildren(String name) {
        final List<Person> children = relationshipBrowser.findChildrenOf(name);
        children.forEach(System.out::println);
    }
}
