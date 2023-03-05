package org.example.exercicio2estruturacondicional;

import java.util.Scanner;

/**
 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode começar
 * em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
 * */
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inicio = scanner.nextInt();
        int fim = scanner.nextInt();

        int duracao;

        if (inicio < fim){
            duracao = fim - inicio;
        } else {
            duracao = 24 - inicio + fim;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        scanner.close();
    }
}
