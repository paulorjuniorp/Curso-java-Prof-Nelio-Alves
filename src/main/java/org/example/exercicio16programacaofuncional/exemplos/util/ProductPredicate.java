package org.example.exercicio16programacaofuncional.exemplos.util;

import org.example.exercicio16programacaofuncional.exemplos.model.entities.Product;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Product> {
    @Override
    public boolean test(Product product) {
        return product.getPrice() >= 100;
    }
}
