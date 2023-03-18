package org.example.exercicio2estruturacondicional;

import java.util.Scanner;

/**
 * Leia 2 valores com uma casa decimal (x e y), que deve representar as coordenadas de um ponto em um plano. A seguir,
 * determine qual o quadrante ao qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem (x=y=0).
 *
 * Se o ponto estiver na origem, escreva a mensagem "Origem".
 *
 * Se o ponto estiver sobre um dos eixos escreva "Eixo X" ou "Eixo Y", conforme for a situação.
 * */
public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double eixoX = scanner.nextDouble();
        double eixoY = scanner.nextDouble();

        if (eixoX == 0 && eixoY == 0){
            System.out.println("Origem");
        } else if (eixoX == 0 && eixoY > 0){
            System.out.println("Eixo Y");
        } else if (eixoY == 0 && eixoX > 0){
            System.out.println("Eixo X");
        } else if (eixoX > 0){
            if (eixoY > 0){
                System.out.println("Q1");
            } else if (eixoY < 0) {
                System.out.println("Q4");
            }
        } else if (eixoX < 0) {
            if (eixoY > 0){
                System.out.println("Q2");
            } else if (eixoY < 0) {
                System.out.println("Q3");
            }
        }

        scanner.close();
    }
}
