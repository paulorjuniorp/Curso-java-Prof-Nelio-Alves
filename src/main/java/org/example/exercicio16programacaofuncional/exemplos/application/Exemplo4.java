package org.example.exercicio16programacaofuncional.exemplos.application;

import org.example.exercicio16programacaofuncional.exemplos.model.entities.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Exemplo com transparência
 *
 * */
public class Exemplo4 {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.0));
        list.add(new Product("Tablet", 450.0));

        list.sort(Exemplo4::compareProducts);

        list.forEach(System.out::println);
    }

    /**
     * Função de primeira ordem pq pode ser passado como argumento para outra função e pode ser retornado
     * por uma função
     * */
    public static int compareProducts(Product p1, Product p2){
        return p1.getPrice().compareTo(p2.getPrice());
    }
}
