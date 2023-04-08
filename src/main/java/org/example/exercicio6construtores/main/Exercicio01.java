package org.example.exercicio6construtores.main;

import org.example.exercicio6construtores.entities.ContaBancaria;

import java.util.Scanner;

/**
 * Em um banco, para se cadastrar uma conta bancária, é necessário informar o número da conta, o nome do titular da
 * conta, e o valor de depósito inicial que o titular depositou ao abrir a conta. Este valor de depósito inicial,
 * entretanto, é opcional, ou seja: se o titular não tiver dinheiro a depositar no momento de abrir sua conta, o depósito
 * inicial não será feito e o saldo inicial da conta será, naturalmente zero.
 *
 * Importante: uma vez que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado. Já o nome do titular
 * pode ser alterado (pois uma pessoa pode mudar de nome por ocasião de casamento, por exemplo).
 *
 * Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para proteger isso. O saldo
 * só aumenta por meio de depósitos, e só diminui por meio de saques. Para cada saque realizado, o banco cobra uma taxa
 * de R$ 5,00. Nota: a conta pode ficar com saldo negativo se o saldo não for suficiente para realizar o saque e/ou pagar
 * a taxa.
 *
 * Você deve fazer um programa que realize o cadastro de uma conta, dando opção para que seja ou não informado o valor de
 * depósito inicial. Em seguida, realizar um depósito de depois um saque, sempre mostrando os dados da conta após cada
 * operação.
 * */
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        scanner.nextLine();
        System.out.print("Digite o nome do titular: ");
        String nomeTitular = scanner.nextLine();

        System.out.print("Será realizado um depósito inicial (s/n)? ");
        char temDepositoInicial = scanner.next().charAt(0);

        double deposito;

        ContaBancaria contaBancaria = new ContaBancaria(numeroConta,nomeTitular);
        if (temDepositoInicial == 's'){
            System.out.print("Digite o valor de depósito: ");
            deposito = scanner.nextDouble();
            contaBancaria.deposito(deposito);
        }
        System.out.println("Dados da conta: ");
        System.out.println(contaBancaria);


        System.out.print("Digite o valor de depósito: ");
        deposito = scanner.nextDouble();
        contaBancaria.deposito(deposito);
        System.out.println("Dados atualizados da conta: ");
        System.out.println(contaBancaria);

        System.out.print("Digite o valor de saque: ");
        double saque = scanner.nextDouble();
        contaBancaria.saque(saque);
        System.out.println("Dados atualizados da conta: ");
        System.out.println(contaBancaria);

        scanner.close();
    }
}
