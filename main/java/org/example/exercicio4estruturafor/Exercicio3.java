package org.example.exercicio4estruturafor;

import java.util.Scanner;

/**
 * Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste de 3
 * valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes conjuntos de 3 valores,
 * sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5
 * */
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int qtdEntradas = scanner.nextInt();

        for (int i = 0; i < qtdEntradas;i++){
            double valor1 = scanner.nextDouble();
            double valor2 = scanner.nextDouble();
            double valor3 = scanner.nextDouble();

            double mediaPonderada = ((valor1 * 2) + (valor2 * 3) + (valor3 * 5)) / 10;

            System.out.printf("%.1f%n",mediaPonderada);
        }

        scanner.close();
    }
}
