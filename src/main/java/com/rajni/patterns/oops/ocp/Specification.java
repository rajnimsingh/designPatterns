package com.rajni.patterns.oops.ocp;

public interface Specification<T> {

    boolean isSatisfied(T item);
}
