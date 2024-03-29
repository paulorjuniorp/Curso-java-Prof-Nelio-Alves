package org.example.exercicio16programacaofuncional.exercicios.application;

import org.example.exercicio16programacaofuncional.exercicios.model.entities.Produto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Fazer um programa para ler um conjunto de produtos a partir de um arquivo em formato .csv
 * (suponha que exista pelo menos um produto).
 *
 * Em seguida mostrar o preço médio dos produtos. Depois, mostrar os nomes, em ordem decrescente, dos produtos
 * que possuem preço inferior ao preço médio.
 * */
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o caminho completo para o arquivo: ");
        String path = scanner.nextLine();

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            List<Produto> lista = new ArrayList<>();
            String line = bufferedReader.readLine();
            while (line != null){
                String[] linhas = line.split(",");
                lista.add(new Produto(linhas[0], Double.parseDouble(linhas[1])));

                line = bufferedReader.readLine();
            }

            double media = lista.stream()
                    .map(produto -> produto.getPreco())
                    .reduce(0.0, Double::sum) / lista.size();

            System.out.println("Média de preço dos produtos: " + media);

            Comparator<String> comparator = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            List<String> collect = lista.stream()
                    .filter(produto -> produto.getPreco() < media)
                    .map(produto -> produto.getNome())
                    .sorted(comparator.reversed())
                    .toList();
            collect.forEach(System.out::println);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        scanner.close();
    }
}
