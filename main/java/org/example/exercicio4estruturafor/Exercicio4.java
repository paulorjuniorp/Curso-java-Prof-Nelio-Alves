package org.example.exercicio4estruturafor;

import java.util.Scanner;

/**
 * Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo segundo.
 * Se o denominador for igual a zero, mostrar a mensagem "divisão impossivel".
 * */
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int qtdEntradas = scanner.nextInt();

        for (int i = 0; i < qtdEntradas; i++){
            double numerador = scanner.nextInt();
            double denominador = scanner.nextInt();

            double divisao;
            if (denominador == 0){
                System.out.println("Divisão impossível");
            } else {
                divisao = numerador / denominador;
                System.out.println(divisao);
            }
        }
    }
}
