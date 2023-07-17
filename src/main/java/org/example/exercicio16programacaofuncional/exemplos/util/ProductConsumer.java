package org.example.exercicio16programacaofuncional.exemplos.util;

import org.example.exercicio16programacaofuncional.exemplos.model.entities.Product;

import java.util.function.Consumer;

public class ProductConsumer implements Consumer<Product> {
    @Override
    public void accept(Product product) {
        product.setPrice(product.getPrice() * 1.1);
    }
}
