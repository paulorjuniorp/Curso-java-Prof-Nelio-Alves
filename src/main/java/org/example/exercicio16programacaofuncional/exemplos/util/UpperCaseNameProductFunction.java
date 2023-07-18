package org.example.exercicio16programacaofuncional.exemplos.util;

import org.example.exercicio16programacaofuncional.exemplos.model.entities.Product;

import java.util.function.Function;

public class UpperCaseNameProductFunction implements Function<Product, String> {
    @Override
    public String apply(Product product) {
        return product.getName().toUpperCase();
    }
}
