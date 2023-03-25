package org.example.exercicio5orientacaoaobjetos.exercicio2.main;

import org.example.exercicio5orientacaoaobjetos.exercicio2.entities.Funcionario;

import java.util.Scanner;

/**
 * Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em seguida mostrar os dados do
 * funcionário (nome e salário líquido). Em seguida, aumentar o salário do funcionário com base em uma porcentagem dada
 * (somente o salário bruto é afetado pela porcentagem) e mostrar novamente os dados do funcionário.
 * */
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();

        System.out.print("Nome: ");
        funcionario.nome = scanner.nextLine();

        System.out.print("Salário bruto: ");
        funcionario.salarioBruto = scanner.nextDouble();

        System.out.print("Imposto: ");
        funcionario.imposto = scanner.nextDouble();

        funcionario.salarioLiquido();

        System.out.println("Funcionário: " + funcionario);

        System.out.print("Qual porcentagem a ser incrementada no salário? ");
        double taxa = scanner.nextDouble();
        funcionario.aumentarSalario(taxa);

        System.out.println("Atualização de dados: " + funcionario);

        scanner.close();
    }
}
