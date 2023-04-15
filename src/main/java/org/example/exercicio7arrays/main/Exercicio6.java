package org.example.exercicio7arrays.main;

import java.util.Scanner;

/**
 * Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um terceiro vetor C
 * onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima o vetor C gerado.
 * */
public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos valores vai ter cada vetor? ");
        int entrada = scanner.nextInt();

        int[] a = new int[entrada];
        int[] b = new int[entrada];
        int[] c = new int[entrada];

        System.out.println("Digite os valores do vetor A:");
        for (int i = 0; i < a.length; i++){
            a[i] = scanner.nextInt();
        }

        System.out.println("Digite os valores do vetor B:");
        for (int i = 0; i < b.length; i++){
            b[i] = scanner.nextInt();
        }

        System.out.println("VETOR RESULTANTE:");
        for (int i = 0;i < c.length;i++){
            c[i] = a[i] + b[i];
            System.out.println(c[i]);
        }

        scanner.close();
    }
}
