package org.example.exercicio5orientacaoaobjetos.exercicio1.main;

import org.example.exercicio5orientacaoaobjetos.exercicio1.entities.Retangulo;

import java.util.Locale;
import java.util.Scanner;

/**
 * Fazer um programa para ler os valores da largura e altura de um retângulo. Em seguida, mostrar na tela o valor de
 * sua área, perímetro e diagonal.
 * */
public class Exercicio1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter rectangle width and height: ");
        Retangulo retangulo = new Retangulo();
        retangulo.largura = scanner.nextDouble();
        retangulo.altura = scanner.nextDouble();

        System.out.println(retangulo);

        scanner.close();
    }
}
