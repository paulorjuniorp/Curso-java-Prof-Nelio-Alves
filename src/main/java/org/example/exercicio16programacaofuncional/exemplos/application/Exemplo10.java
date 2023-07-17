package org.example.exercicio16programacaofuncional.exemplos.application;

import org.example.exercicio16programacaofuncional.exemplos.model.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Predicate: Expressão lambda declarada
 *
 * */
public class Exemplo10 {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.0));
        list.add(new Product("Mouse", 50.0));
        list.add(new Product("Tablet",350.50));
        list.add(new Product("HD Case", 80.90));

        Predicate<Product> productPredicate = p -> p.getPrice() >= 100;

        list.removeIf(productPredicate);

        for (Product product : list) {
            System.out.println(product);
        }
    }
}
