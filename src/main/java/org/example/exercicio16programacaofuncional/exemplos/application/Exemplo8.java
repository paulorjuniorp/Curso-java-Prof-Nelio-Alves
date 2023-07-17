package org.example.exercicio16programacaofuncional.exemplos.application;

import org.example.exercicio16programacaofuncional.exemplos.model.entities.Product;
import org.example.exercicio16programacaofuncional.exemplos.util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;

/**
 * Predicate: Reference method com método estático
 * */
public class Exemplo8 {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.0));
        list.add(new Product("Mouse", 50.0));
        list.add(new Product("Tablet",350.50));
        list.add(new Product("HD Case", 80.90));

        list.removeIf(Product::staticProductPredicate);

        for (Product product : list) {
            System.out.println(product);
        }
    }
}
