package org.example.exercicio2estruturacondicional;

import java.util.Scanner;

/**
 * Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar
 * */
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();

        if (numero % 2 == 0){
            System.out.println("PAR");
        }else {
            System.out.println("ÍMPAR");
        }

        scanner.close();
    }
}
