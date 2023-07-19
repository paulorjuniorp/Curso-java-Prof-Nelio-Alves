package org.example.exercicio16programacaofuncional.exemplos.application;

import org.example.exercicio16programacaofuncional.exemplos.model.entities.Product;
import org.example.exercicio16programacaofuncional.exemplos.model.service.ProductService;

import java.util.ArrayList;
import java.util.List;

/**
 * Criando funções que recebem funções como parâmetro
 *
 * Fazer um programa que, a partir de uma lista de produtos, calcule a soma dos preço somente dos produtos cujo nome
 * começa com "T"
 * */
public class Exemplo19 {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.0));
        list.add(new Product("Mouse", 50.0));
        list.add(new Product("Tablet",350.50));
        list.add(new Product("HD Case", 80.90));

        double sum = new ProductService().filteredSum(list, product -> product.getName().charAt(0) == 'T');

        System.out.printf("Sum = %.2f",sum);
    }
}
