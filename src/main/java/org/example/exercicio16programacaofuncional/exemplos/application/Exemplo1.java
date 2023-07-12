package org.example.exercicio16programacaofuncional.exemplos.application;

import org.example.exercicio16programacaofuncional.exemplos.model.entities.Product;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Problema
 *
 * Suponha uma classe Product com os atributos name e price.
 *
 * Podemos implementar a comparação de produtos por meio da implementação da interface Comparable<Product>.
 *
 * Entretanto, desta forma nossa classe não fica fechada para alteração: se o critério de comparação mudar, precisaremos
 * alterar a classe Product.
 *
 * Podemos então usar o default method "sort" da interface List:
 * default void sort(Comparator<? super E> c)
 * */
public class Exemplo1 {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.0));
        list.add(new Product("Notebook", 1200.0));
        list.add(new Product("Tablet", 450.0));

        list.sort(new MyComparator());

        for (Product product : list) {
            System.out.println(product);
        }

    }
}
