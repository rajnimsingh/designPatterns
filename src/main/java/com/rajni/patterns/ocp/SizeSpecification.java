package com.rajni.patterns.ocp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class SizeSpecification implements Specification<Product> {
    private Size size;

    @Override
    public boolean isSatisfied(Product item) {
        return size == item.getSize();
    }
}
