package org.example.exercicio7arrays.main;

import java.util.Scanner;

/**
 * Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média aritmética somente dos
 * números pares lidos, com uma casa decimal. Se nenhum número par for digitado, mostrar a mensagem "NENHUM NÚMERO PAR"
 * */
public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos elementos vai ter o vetor? ");
        int entrada = scanner.nextInt();

        double[] numeros = new double[entrada];

        for (int i = 0; i < numeros.length; i++){
            System.out.print("Digite um número: ");
            numeros[i] = scanner.nextDouble();
        }

        double somaPares = 0;
        int somaPosicao = 0;
        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] % 2 == 0){
                somaPares += numeros[i];
                somaPosicao++;
            }
        }

        if (somaPares > 0) {
            double media = somaPares / somaPosicao;

            System.out.printf("MÉDIA DOS PARES = %.1f", media);

            scanner.close();
        }else {
            System.out.println("NENHUM NÚMERO PAR");
        }
    }
}
