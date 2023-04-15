package org.example.exercicio7arrays.main;

import java.util.Scanner;

/**
 * Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa que calcule e escreva
 * a maior e a menor altura do grupo, a média de altura das mulheres, e o número de homens.
 * */
public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantas pessoas serão digitadas? ");
        int entrada = scanner.nextInt();

        double[] alturas = new double[entrada];
        char[] generos = new char[entrada];

        for (int i=0; i<entrada; i++){
            System.out.print("Altura da "+(1+i)+"º pessoa: ");
            double altura = scanner.nextDouble();
            alturas[i] = altura;

            System.out.print("Gênero da "+(1+i)+"º pessoa: ");
            char genero = scanner.next().charAt(0);
            generos[i] = genero;
        }

        double menorAltura = alturas[0];
        double maiorAltura = alturas[0];

        for (int i = 0; i < entrada; i++){
            if (menorAltura > alturas[i]){
                menorAltura = alturas[i];
            }

            if (maiorAltura < alturas[i]){
                maiorAltura = alturas[i];
            }
        }

        double somaAlturaMulheres = 0;
        double qtdMulheres = 0;
        int qtdHomens = 0;
        for (int i = 0; i < entrada; i++) {
            if (generos[i] == 'f' || generos[i] == 'F'){
                somaAlturaMulheres += alturas[i];
                qtdMulheres++;
            } else {
                qtdHomens++;
            }
        }

        double mediaAlturaMulheres = somaAlturaMulheres / qtdMulheres;

        System.out.println("Menor altura = " + menorAltura);
        System.out.println("Maior altura = " + maiorAltura);
        System.out.printf("Media das alturas das mulheres = %.2f%n",mediaAlturaMulheres);
        System.out.println("Número de homens = " + qtdHomens);
    }
}
