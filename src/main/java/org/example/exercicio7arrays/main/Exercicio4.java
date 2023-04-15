package org.example.exercicio7arrays.main;

import java.util.Scanner;

/**
 * Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na tela todos os
 * números pares, e também a quantidade de pares.
 * */
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos números você vai digitar? ");
        int entrada = scanner.nextInt();

        int[] numeros = new int[entrada];

        for(int i = 0;i<numeros.length;i++){
            System.out.print("Digite um número: ");
            numeros[i] = scanner.nextInt();
        }

        String pares = "";
        int qtdPares = 0;
        for (int i = 0;i < numeros.length;i++){
            if (numeros[i] % 2 == 0){
                pares += numeros[i] + " ";
                qtdPares ++;
            }
        }

        System.out.println("NUMEROS PARES");
        System.out.println(pares);
        System.out.printf("QUANTIDADE DE PARES = %d",qtdPares);

        scanner.close();
    }
}
