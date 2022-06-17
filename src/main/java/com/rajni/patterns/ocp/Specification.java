package com.rajni.patterns.ocp;

public interface Specification<T> {

    boolean isSatisfied(T item);
}
