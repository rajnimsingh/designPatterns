package com.rajni.patterns.oops.di;

import org.javatuples.Triplet;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Relationships implements RelationshipBrowser {
    private List<Triplet<Person, Relationship, Person>> relations = new ArrayList<>();

    public void addParentAndChild(Person parent, Person child) {
        relations.add(new Triplet<>(parent, Relationship.PARENT, child));
        relations.add(new Triplet<>(child, Relationship.CHILD, parent));
    }

    @Override
    public List<Person> findChildrenOf(String name) {
        return relations.stream().filter(f -> f.getValue0().getName().equals(name) && f.getValue1() == Relationship.PARENT).map(Triplet::getValue2).collect(Collectors.toList());
    }
}
