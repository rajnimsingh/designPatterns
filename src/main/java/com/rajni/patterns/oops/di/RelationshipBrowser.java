package com.rajni.patterns.oops.di;

import java.util.List;

public interface RelationshipBrowser {
    List<Person> findChildrenOf(String name);
}
