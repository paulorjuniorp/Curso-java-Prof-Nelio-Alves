package org.example.exercicio7arrays.main;

import org.example.exercicio7arrays.entities.Pessoa;

import java.util.Scanner;

/**
 * Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na tela a
 * altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos, bem como os nomes
 * dessas pessoas caso houver.
 * */
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int entrada = scanner.nextInt();

        Pessoa[] pessoas = new Pessoa[entrada];

        for (int i = 0;i < pessoas.length;i++){
            System.out.println("Dados da " + (i+1) + "º pessoa");
            System.out.print("Nome: ");
            scanner.nextLine();
            String nome = scanner.nextLine();
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            System.out.print("Altura: ");
            double altura = scanner.nextDouble();
            pessoas[i] = new Pessoa(nome,idade,altura);
        }

        double somaAltura = 0;
        for (Pessoa pessoa : pessoas) {
            somaAltura += pessoa.getAltura();
        }

        double mediaAltura = somaAltura / pessoas.length;
        System.out.printf("Altura média: %.2f%n",mediaAltura);

        double somaMenorDezesseis = 0;
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getIdade() < 16){
                somaMenorDezesseis+=1;
            }
        }

        double porcentagemAltura = (somaMenorDezesseis /  pessoas.length) * 100;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n",porcentagemAltura);

        for (Pessoa pessoa : pessoas) {
            if (pessoa.getIdade() < 16){
                System.out.println(pessoa.getNome());
            }
        }

        scanner.close();
    }
}
