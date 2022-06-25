package com.rajni.patterns.oops.ocp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class AndSpecification<T> implements Specification<T> {
    private Specification<T> first;
    private Specification<T> second;

    @Override
    public boolean isSatisfied(T item) {
        return first.isSatisfied(item) && second.isSatisfied(item);
    }
}
