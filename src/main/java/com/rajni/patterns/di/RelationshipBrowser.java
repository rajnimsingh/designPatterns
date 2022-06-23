package com.rajni.patterns.di;

import java.util.List;

public interface RelationshipBrowser {
    List<Person> findChildrenOf(String name);
}
