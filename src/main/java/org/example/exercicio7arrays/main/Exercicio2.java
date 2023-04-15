package org.example.exercicio7arrays.main;

import java.util.Scanner;

/**
 * Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
 * - Imprimir todos os elementos do vetor
 * - Mostrar na tela a soma e a média dos elementos do vetor
 * */
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int entrada = scanner.nextInt();

        double[] numeros = new double[entrada];

        for (int i = 0; i < numeros.length; i++){
            System.out.print("Digite um número: ");
            numeros[i] = scanner.nextInt();
        }
        String saida = "";
        for (int i = 0; i < numeros.length; i++){
           saida += String.format("%.1f ",numeros[i]);
        }

        System.out.println("VALORES = " + saida);

        double soma = 0;
        for (int i = 0; i < numeros.length; i++){
            soma += numeros[i];
        }
        System.out.println(String.format("SOMA = %.2f",soma));

        double media = soma / numeros.length;

        System.out.println(String.format("MEDIA = %.2f",media));

    }
}
