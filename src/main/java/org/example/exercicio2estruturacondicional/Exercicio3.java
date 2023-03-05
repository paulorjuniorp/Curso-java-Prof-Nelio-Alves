package org.example.exercicio2estruturacondicional;

import java.util.Scanner;

/**
 * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "São Múltiplos" ou "Não são Múltiplos",
 * indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em ordem crescente ou decrescente.
 * */
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        if (A % B == 0 || B % A == 0){
            System.out.println("SÃO MÚLTIPLOS");
        } else {
            System.out.println("NÃO SÃO MÚLTIPLOS");
        }

        scanner.close();
    }
}
