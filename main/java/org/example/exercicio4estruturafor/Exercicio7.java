package org.example.exercicio4estruturafor;

import java.util.Scanner;

/**
 * Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas, começando de
 * 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme exemplo.
 * */
public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();

        for (int i = 1; i <= numero; i++){
            System.out.println(i + " " + (i * i) + " " + (i * i * i));
        }

        scanner.close();
    }
}
