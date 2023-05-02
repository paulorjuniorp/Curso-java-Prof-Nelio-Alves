package org.example.exercicio7arrays.main;

import java.util.Scanner;

/**
 * Fazer um programa para ler dois números inteiros M e N, e depois ler uma matriz M de linhas por N colunas contendo nú-
 * meros inteiros, podendo haver repetições. Em seguida, ler um número inteiro X que pertence à matriz. Para cada ocor-
 * rência de X, mostrar os valores à esquerda, acima, à direita e abaixo de X, quando houver, conforme exemplo.
 *
 * 3 4
 * 10 8 15 12
 * 21 11 23 8
 * 14 5 13 9
 * 8
 *
 * Position 0,1:
 * Left: 10
 * Right: 15
 * Down: 11
 *
 * Position 1,3:
 * Left: 23
 * Up: 12
 * Down: 19
 * */
public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int linha = scanner.nextInt();
        int coluna = scanner.nextInt();

        int[][] matriz = new int[linha][coluna];

        for (int i = 0; i < linha; i++){
            for (int j = 0; j < coluna; j++){
                matriz[i][j] = scanner.nextInt();
            }
        }

        int numero = scanner.nextInt();

        for (int i = 0; i < linha; i++){
            for (int j = 0; j < coluna; j++){
                if (numero == matriz[i][j]){
                    System.out.printf("Posição %d,%d: %n",i,j);
                    if (i > 0){
                        System.out.println("Acima: " + matriz[i-1][j]);
                    }
                    if (j > 0){
                        System.out.println("Esquerda: " + matriz[i][j-1]);
                    }
                    if (i < matriz.length - 1){
                        System.out.println("Baixo: " + matriz[i+1][j]);
                    }
                    if (j < matriz[i].length-1){
                        System.out.println("Direita: " + matriz[i][j+1]);
                    }
                }
            }
        }

        scanner.close();
    }
}
