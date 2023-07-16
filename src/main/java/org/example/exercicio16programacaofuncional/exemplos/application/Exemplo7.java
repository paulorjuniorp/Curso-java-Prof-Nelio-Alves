package org.example.exercicio16programacaofuncional.exemplos.application;

import org.example.exercicio16programacaofuncional.exemplos.model.entities.Product;
import org.example.exercicio16programacaofuncional.exemplos.util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;

/**
 * Predicate: implementação de interface
 *
 * Fazer um programa que, a partir de uma lista de produtos remova da lista somente aqueles cujo preço mínimo seja 100.
 *
 * */
public class Exemplo7 {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.0));
        list.add(new Product("Mouse", 50.0));
        list.add(new Product("Tablet",350.50));
        list.add(new Product("HD Case", 80.90));

        list.removeIf(new ProductPredicate());

        for (Product product : list) {
            System.out.println(product);
        }

    }
}
