package org.example.exercicio12tratamentoexcecoes.exercicios.application;

import org.example.exercicio12tratamentoexcecoes.exercicios.model.entities.Conta;
import org.example.exercicio12tratamentoexcecoes.exercicios.model.exceptions.SaqueExeption;

import java.util.Scanner;

/**
 * Fazer um programa para ler os dados de uma conta bancária e depois realizar um saque nesta conta bancária,
 * mostrando o novo saldo. Um saque não pode ocorrer se não houver salda na conta, ou se o valor do saque for
 * superior ao limite de saque da conta.
 * */
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os dados da conta");

        try {

            System.out.print("Número da conta: ");
            int numeroConta = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Titular: ");
            String nome = scanner.nextLine();
            System.out.print("Saldo inicial: ");
            double saldoInicial = scanner.nextDouble();
            System.out.print("Limite de saque: ");
            double limiteSaque = scanner.nextDouble();

            Conta conta = new Conta(numeroConta, nome, saldoInicial, limiteSaque);

            System.out.println("\n");
            System.out.print("Digite a quantia para o saque: ");
            conta.saque(scanner.nextDouble());

            System.out.println("Novo saldo: " + conta.getSaldo());
        } catch (SaqueExeption e){
            System.out.println("Erro no saque: " + e.getMessage());
        }

    }
}
