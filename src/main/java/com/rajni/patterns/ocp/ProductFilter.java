package com.rajni.patterns.ocp;

import java.util.List;
import java.util.stream.Stream;

public class ProductFilter implements Filter<Product> {
    @Override
    public Stream<Product> filter(List<Product> items, Specification<Product> specs) {
        return items.stream().filter(specs::isSatisfied);
    }
}
