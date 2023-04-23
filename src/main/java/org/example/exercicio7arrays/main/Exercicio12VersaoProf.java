package org.example.exercicio7arrays.main;

import org.example.exercicio7arrays.entities.Aluguel;

import java.util.Scanner;

public class Exercicio12VersaoProf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos quartos vão ser alugados? ");
        int quartosAlugados = scanner.nextInt();

        Aluguel[] alugueis = new Aluguel[10];

        for (int i = 1; i <= quartosAlugados;i++){
            System.out.println();
            System.out.printf("Aluguel #%d:%n",i);
            System.out.print("Nome: ");
            scanner.nextLine();
            String nome = scanner.nextLine();

            System.out.print("Email: ");
            String email = scanner.nextLine();

            System.out.print("Quarto: ");
            int numeroQuarto = scanner.nextInt();

            alugueis[numeroQuarto] = new Aluguel(nome,email);
        }

        System.out.println();
        System.out.println("Quartos ocupados: ");
        for (int i = 0; i < alugueis.length; i++){
            if (alugueis[i] != null){
                System.out.printf("%d: %s%n",i,alugueis[i]);
            }
        }
    }
}
