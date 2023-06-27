package org.example.exercicio15genericsetmap.exemplos.application;

import org.example.exercicio15genericsetmap.exemplos.model.service.PrintService;

import java.util.Scanner;

/**
 * Deseja-se fazer um programa que leia uma quantidade N, e depois N números inteiros. Ao final, imprima esses
 * números de forma organizada conforme exemplo. Em seguida, informar qual foi o primeiro valor informado.
 * */
public class Exemplo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PrintService printService = new PrintService();

        System.out.print("How many values? ");
        int values = scanner.nextInt();

        for (int i = 0; i < values; i++){
            int value = scanner.nextInt();
            printService.addValue(value);
        }

        printService.printValue();
        System.out.println("First: " + printService.first());

        scanner.close();
    }
}
