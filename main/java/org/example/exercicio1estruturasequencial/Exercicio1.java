package org.example.exercicio1estruturasequencial;

import java.util.Scanner;

/*
* Faça um programa para ler o dois valores inteiros, e depois mostrar na tela a soma desse números com uma mensagem
* explicativa, conforme exemplos.
* */
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor1 = sc.nextInt();
        int valor2 = sc.nextInt();

        System.out.println("SOMA = " + (valor1 + valor2));

        sc.close();
    }
}
