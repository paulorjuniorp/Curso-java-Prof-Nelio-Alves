package org.example.exercicio7arrays.main;

import java.util.Scanner;

/**
 * Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros e
 * armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos
 * */
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos numeros você vai digitar? ");
        int entrada = scanner.nextInt();

        int[] numeros = new int[entrada];

        for (int i = 0; i < numeros.length; i++){
            System.out.print("Digite um número: ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS: ");
        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] < 0){
                System.out.println(numeros[i]);
            }
        }

        scanner.close();
    }
}
