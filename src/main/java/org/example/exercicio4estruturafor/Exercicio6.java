package org.example.exercicio4estruturafor;

import java.util.Scanner;

/**
 * Ler um número inteiro N e calcular todos os seus divisores.
 * */
public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valor = scanner.nextInt();

        for (int i = 1; i <= valor; i++){
            if (valor % i == 0){
                System.out.println(i);
            }
        }
        scanner.close();
    }
}
