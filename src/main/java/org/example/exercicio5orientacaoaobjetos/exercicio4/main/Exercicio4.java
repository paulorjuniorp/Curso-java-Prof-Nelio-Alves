package org.example.exercicio5orientacaoaobjetos.exercicio4.main;

import org.example.exercicio5orientacaoaobjetos.exercicio4.entities.ConversorMoeda;

import java.util.Scanner;

/**
 * Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por uma pessoa em reais.
 * Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda que a pessoa terá que pagar 6% de IOF sobre
 * o valor em dólar.
 * */
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual é o preço do dolar: ");
        double valorDolar = scanner.nextDouble();

        System.out.print("Quantos dolares serão comprador? ");
        int qtdDolar = scanner.nextInt();

        System.out.println("Total a ser pago em reais = " + String.format("%.2f",ConversorMoeda.conversao(valorDolar,qtdDolar)));

        scanner.close();
    }
}
