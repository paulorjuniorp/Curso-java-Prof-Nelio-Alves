package org.example.exercicio16programacaofuncional.exemplos.application;

import org.example.exercicio16programacaofuncional.exemplos.model.entities.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Expressão lambda
 * */
public class Exemplo6 {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.0));
        list.add(new Product("Tablet", 450.0));

        list.sort(Exemplo6::compareProducts);

        // expressão lambda = anônima e de primeira classe
        list.sort((p1,p2) -> p1.getPrice().compareTo(p2.getPrice()));
    }

    public static int compareProducts(Product p1, Product p2){
        return p1.getPrice().compareTo(p2.getPrice());
    }
}
