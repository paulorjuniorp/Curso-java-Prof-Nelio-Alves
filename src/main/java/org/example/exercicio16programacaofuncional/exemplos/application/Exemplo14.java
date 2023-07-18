package org.example.exercicio16programacaofuncional.exemplos.application;

import org.example.exercicio16programacaofuncional.exemplos.model.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Consumer utilizando expressão lambda
 * */

public class Exemplo14 {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.0));
        list.add(new Product("Mouse", 50.0));
        list.add(new Product("Tablet",350.50));
        list.add(new Product("HD Case", 80.90));

        Consumer<Product> consumerProduct = product -> {
          product.setPrice(product.getPrice() * 1.1);
        };

        list.forEach(consumerProduct);

        list.forEach(System.out::println);
    }
}
