package org.example.exercicio16programacaofuncional.exemplos.application;

import org.example.exercicio16programacaofuncional.exemplos.model.entities.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Predicate
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

        list.removeIf(p -> p.getPrice() >= 100);

        for (Product product : list) {
            System.out.println(product);
        }

    }
}
