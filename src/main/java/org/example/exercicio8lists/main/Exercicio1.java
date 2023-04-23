package org.example.exercicio8lists.main;

import org.example.exercicio8lists.entities.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de N funcionários. Não deve
 * haver repetição de id.
 *
 * Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário. Para isso, o programa deve ler
 * um id e o valor X. Se o id informado não existir, mostrar uma mensagem e abortar a operação. Ao final, mostrar a lis-
 * tagem atualizada dos funcionários, conforme exemplos.
 *
 * Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa ser mudado livremente. Um salário
 * só pode ser aumentado com base em uma operação de aumento por porcentagem dada.
 *
 * how many employees will be registered?
 *
 * Employee #1:
 * Id:xx
 * Name:xx
 * Salary:xx
 *
 * Enter the employee id that will have salary increase: xxx
 * Enter the percentage: xxx
 * List of employees:
 * */
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos funcionários serão registrados? ");
        int entradas = scanner.nextInt();

        List<Funcionario> funcionarios = new ArrayList<>();
        Funcionario funcionario;

        for (int i = 0; i < entradas; i++){
            System.out.println();
            System.out.printf("Funcionario #%d: %n",(i+1));

            System.out.print("Id: ");
            Integer id = scanner.nextInt();

            scanner.nextLine();
            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Salário: ");
            Double salario = scanner.nextDouble();

            funcionario = new Funcionario(id,nome,salario);
            funcionarios.add(funcionario);
        }

        System.out.println();
        System.out.print("Digite o Id que terá o salário incrementado: ");
        int idAumento = scanner.nextInt();
        Funcionario funcionarioAumento = funcionarios.stream().filter(x -> x.getId() == idAumento)
                .findFirst()
                .orElse(null);

        if (funcionarioAumento == null){
            System.out.println("Esse id não foi encontrado");
        } else {
            System.out.print("Digite a porcentagem: ");
            double porcentagem = scanner.nextDouble();
            funcionarioAumento.aumentoSalario(porcentagem);
        }

        System.out.println();
        System.out.println("Lista de funcionários: ");
        funcionarios
                .forEach(System.out::println);

        scanner.close();
    }
}
