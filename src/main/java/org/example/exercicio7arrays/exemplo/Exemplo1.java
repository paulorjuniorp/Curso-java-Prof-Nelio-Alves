package org.example.exercicio7arrays.exemplo;

import org.example.exercicio7arrays.entities.Produto;

import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int entradas = scanner.nextInt();
        Produto[] vect = new Produto[entradas];

        for (int i = 0; i < vect.length; i++){
            scanner.nextLine();
            String nome = scanner.nextLine();
            double valor = scanner.nextDouble();
            vect[i] = new Produto(nome,valor);
        }

        double soma = 0;

        for (int i = 0; i < vect.length; i++){
            soma += vect[i].getValor();
        }

        double media = soma / vect.length;

        System.out.println("Média de preços = " + media);
    }
}
