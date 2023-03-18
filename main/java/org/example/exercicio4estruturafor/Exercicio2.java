package org.example.exercicio4estruturafor;

import java.util.Scanner;

/**
 * Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida. Mostre quantos
 * destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando essas informações con-
 * forme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
 * */
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int qtdNumeros = scanner.nextInt();
        int in = 0;
        int out = 0;
        for (int i = 0; i < qtdNumeros; i++){
            int numero = scanner.nextInt();
            if (numero >= 10 && numero <= 20){
                in++;
            }else {
                out++;
            }
        }
        System.out.println(in + " in");
        System.out.println(out + " out");

        scanner.close();
    }
}
