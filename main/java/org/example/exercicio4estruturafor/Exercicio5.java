package org.example.exercicio4estruturafor;

import java.util.Scanner;

/**
 * Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N - 1) * (N - 2) * (N -3) * ... * 1.
 * Lembrando que, por definição, fatorial de 0 é 1.
 * */
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fatorial = scanner.nextInt();
        int auxiliar = 1;

        for (int i = 0; i < fatorial;i++){
            if (fatorial == 0){
                System.out.println(1);
            }else {
                auxiliar *= fatorial - i;
            }
        }

        System.out.println(auxiliar);
    }
}
