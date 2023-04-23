package org.example.exercicio7arrays.main;

import org.example.exercicio7arrays.entities.Estudante;

import java.util.Scanner;

/**
 * A dona de um pensionato possui dez quartos para alugar para estudantes, sendo esses quartos identificados pelos números
 * 0 a 9.
 *
 * Fazer um programa que inicie com todos os dez quartos vázios, e depois leia uma quantidade N representando o número de
 * estudantes que vão alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos N estudantes. Para cada
 * registro de aluguel, informar o nome e email do estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha
 * que seja escolhido um quarto vago. Ao final, seu programa deve imprimir um relatório de todas as ocupações do pensionato
 * , por ordem de quarto, conforme exemplo.
 *
 * Quantos quartos vão ser alugados?
 *
 * aluguel #n
 *
 * Nome: xxxx
 * email:xxxx
 * quarto:xxxx
 * ...
 * Quartos ocupados
 * nº: nome inquilino, email
 * */
public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos quartos vão ser alugados? ");
        int quartosAlugados = scanner.nextInt();

        int[] quartos = new int[10];
        Estudante[] estudantes = new Estudante[quartosAlugados];

        for (int i=0;i<quartosAlugados;i++){
            System.out.printf("Aluguel #%d:%n",(i+1));
            System.out.print("Nome: ");
            scanner.nextLine();
            String nome = scanner.nextLine();

            System.out.print("Email: ");
            String email = scanner.nextLine();

            System.out.print("Quarto: ");
            int numeroQuarto = scanner.nextInt();
            estudantes[i] = new Estudante(nome,email,numeroQuarto);
        }

        System.out.println("Quartos ocupados: ");
        for (int j = 0; j < quartos.length; j++){
            for (int i = 0; i < estudantes.length; i++){
                if (j == estudantes[i].getQuarto()){
                    quartos[j] = estudantes[i].getQuarto();
                }
            }
        }



        for (int i = 0; i < quartos.length; i++){
            for (int j = 0; j < estudantes.length; j++){
                if (quartos[i] == estudantes[j].getQuarto()){
                    System.out.printf("%d: %s, %s%n",quartos[i],estudantes[j].getNome(),estudantes[j].getEmail());
                }
            }
        }

        scanner.close();
    }
}
