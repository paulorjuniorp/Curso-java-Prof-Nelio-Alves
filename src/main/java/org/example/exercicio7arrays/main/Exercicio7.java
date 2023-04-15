package org.example.exercicio7arrays.main;

import java.util.Scanner;

/**
 * Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida, mostrar na
 * tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos os elementos do vetor
 * que estejam abaixo da média, com uma casa decimal cada.
 * */
public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos elementos vai ter o vetor? ");
        int entrada = scanner.nextInt();

        double[] numeros = new double[entrada];

        for (int i = 0; i < numeros.length;i++){
            System.out.print("Digite um número: ");
            numeros[i] = scanner.nextDouble();
        }

        double soma = 0;
        for (double numero : numeros) {
            soma+=numero;
        }

        double media = soma / numeros.length;

        System.out.printf("MÉDIA DO VETOR = %.3f%n",media);

        System.out.println("ELEMENTOS ABAIXO DA MÉDIA:");
        for (double numero : numeros) {
            if (numero < media){
                System.out.println(numero);
            }
        }

        scanner.close();
    }
}
