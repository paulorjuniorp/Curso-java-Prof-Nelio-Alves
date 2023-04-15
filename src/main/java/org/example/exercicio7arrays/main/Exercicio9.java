package org.example.exercicio7arrays.main;

import java.util.Scanner;

/**
 * Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idade. Os nomes devem ser armazenados
 * em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome da pessoa mais velha
 * */
public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantas pessoas você vai digitar? ");
        int entrada = scanner.nextInt();

        String[] nomes = new String[entrada];
        int[] idades = new int[entrada];

        for (int i = 0; i < entrada; i++){
            System.out.println("Dados da " + (i+1) + "º pessoa");
            System.out.print("Nome: ");
            scanner.nextLine();
            String nome = scanner.nextLine();
            nomes[i] = nome;
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            idades[i] = idade;
        }

        String nomeMaisVelho = nomes[0];
        int idadeMaisVelho = idades[0];
        for (int i = 0; i < entrada;i++){
            if (idadeMaisVelho < idades[i]){
                idadeMaisVelho = idades[i];
                nomeMaisVelho = nomes[i];
            }
        }

        System.out.println("PESSOA MAIS VELHA: " + nomeMaisVelho);

        scanner.close();
    }
}
