package org.example.exercicio7arrays.main;

import java.util.Scanner;

/**
 * Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela o maior número
 * do vetor (supor não haver empates). Mostrar também a posição do maior elemento, considerando a primeira posição como
 * 0 (zero).
 * */
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos números você vai digitar? ");
        int entrada = scanner.nextInt();

        double[] numeros = new double[entrada];

        for (int i = 0;i<numeros.length;i++){
            System.out.print("Digite um número: ");
            numeros[i] = scanner.nextDouble();
        }

        double max = numeros[0];
        int posicao = 0;
        for (int i = 0; i < numeros.length;i++){
            if (max < numeros[i]){
                max = numeros[i];
                posicao = i;
            }
        }

        System.out.println("MAIOR VALOR = " + max);
        System.out.println("POSIÇÃO DO MAIOR VALOR = " + posicao);

        scanner.close();
    }
}
