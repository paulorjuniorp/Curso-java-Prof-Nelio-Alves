package org.example.exercicio1estruturasequencial;

import java.util.Scanner;

/**
 * Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de
 * uma peça 2, o número de peças 2 e o valor de cada peça 2. Calcule e mostre o valor a ser pago.
 * */
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String codigo1 = scanner.next();
        int numeroPecas1 = scanner.nextInt();
        double valorPeca1 = scanner.nextDouble();

        String codigo2 = scanner.next();
        int numeroPecas2 = scanner.nextInt();
        double valorPeca2 = scanner.nextDouble();

        double valorSerPago = numeroPecas1 * valorPeca1 + numeroPecas2 * valorPeca2;

        System.out.printf("VALOR A PAGAR: R$ %.2f", valorSerPago);

        scanner.close();
    }
}
