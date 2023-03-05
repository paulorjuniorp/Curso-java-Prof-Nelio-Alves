package org.example.exercicio1estruturasequencial;

import java.util.Scanner;

/**
 * Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora
 * e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
 * */
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroFuncionario = scanner.nextInt();
        int horasTrabalhadas = scanner.nextInt();
        double valorHora = scanner.nextDouble();

        double salario = horasTrabalhadas * valorHora;

        System.out.printf("NUMERO = %d%nSALARIO = R$ %.2f", numeroFuncionario, salario);

        scanner.close();
    }
}
