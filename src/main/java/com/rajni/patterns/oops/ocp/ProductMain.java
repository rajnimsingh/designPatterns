package com.rajni.patterns.oops.ocp;

import java.util.ArrayList;
import java.util.List;

public class ProductMain {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(Product.builder().name("Tommy Hilfiger Shirt").color(Color.BLUE).size(Size.LARGE).build());
        products.add(Product.builder().name("Jeans").color(Color.GREEN).size(Size.SMALL).build());
        products.add(Product.builder().name("T-shirts").color(Color.RED).size(Size.LARGE).build());
        products.add(Product.builder().name("Jumpsuits").color(Color.BLUE).size(Size.EXTRA_SMALL).build());

        // find all the products which are green colored.
        ProductFilter productFilter = new ProductFilter();
        productFilter.filter(products, new ColorSpecification(Color.GREEN)).forEach(System.out::println);

        // find all the products which are large sized.
        productFilter.filter(products, new SizeSpecification(Size.LARGE)).forEach(System.out::println);

        // find all products which are blue colored and large sized
        productFilter.filter(products, new AndSpecification<>(new ColorSpecification(Color.BLUE),
                new SizeSpecification(Size.LARGE))).forEach(System.out::println);
    }
}
