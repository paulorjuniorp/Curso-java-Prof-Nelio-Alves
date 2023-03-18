package org.example.exercicio2estruturacondicional;

import java.util.Scanner;

/**
 * Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não
 * */
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();

        if (numero < 0){
            System.out.println("NEGATIVO");
        }else {
            System.out.println("NÃO NEGATIVO");
        }

        scanner.close();
    }
}
