package org.example.exercicio16programacaofuncional.exemplos.application;

import org.example.exercicio16programacaofuncional.exemplos.model.entities.Product;
import org.example.exercicio16programacaofuncional.exemplos.util.UpperCaseNameProductFunction;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Function utilizando lambda inline
public class Exemplo18 {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.0));
        list.add(new Product("Mouse", 50.0));
        list.add(new Product("Tablet",350.50));
        list.add(new Product("HD Case", 80.90));

        List<String> names = list.stream().map(product -> product.getName().toUpperCase()).toList();

        names.forEach(System.out::println);
    }
}
