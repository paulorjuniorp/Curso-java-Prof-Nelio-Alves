package org.example.exercicio7arrays.main;

import org.example.exercicio7arrays.entities.Aluno;

import java.util.Scanner;

/**
 * Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram no 1º e 2º semestres.
 * Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir os nomes dos alunos aprovados, considerando
 * aprovados aqueles cuja média das notas seja maior ou igual a 6.0 (seis).
 * */
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos alunos serão digitados? ");
        int entrada = scanner.nextInt();

        Aluno[] alunos = new Aluno[entrada];

        for (int i = 0; i < alunos.length; i++){
            System.out.println("Digite nome, primeira e segunda nota do " +(1+i)+"º aluno:");
            scanner.nextLine();
            String nome = scanner.nextLine();
            double nota1 = scanner.nextDouble();
            double nota2 = scanner.nextDouble();
            alunos[i] = new Aluno(nome,nota1,nota2);
        }

        System.out.println("ALUNOS APROVADOR: ");
        for (Aluno aluno : alunos) {
            double media = (aluno.getNota1() + aluno.getNota2())/2;
            if (media >= 6){
                System.out.println(aluno.getNome());
            }
        }

        scanner.close();

    }
}
