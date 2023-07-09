package org.example.exercicio15genericsetmap.exercicios.application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Em um portal de cursos online, cada usuário possui um código único, representado por um número inteiro.
 * Cada instrutor do portal pode ter vários cursos, sendo que um mesmo aluno pode matricular em quantos cursos
 * quiser. Assim, o número total de alunos de um instrutor não é simplesmente a soma dos alunos de todos os
 * cursos que ele possui, pois pode haver alunos repetidos em mais de um curso.
 * O instrutor Alex possui três cursos A, B e C, e deseja saber seu número total de alunos.
 * Seu programa deve ler os alunos dos cursos A, B e C do instrutor Alex, depois mostrar a quantidade total de
 * alunos dele, conforme exemplo
 * */
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> cursoA = new HashSet<>();
        Set<Integer> cursoB = new HashSet<>();
        Set<Integer> cursoC = new HashSet<>();

        System.out.print("Quantos estudantes matriculados no curso A? ");
        int entrada = scanner.nextInt();
        for (int i = 0; i < entrada; i++){
            int numeroUsuario = scanner.nextInt();
            cursoA.add(numeroUsuario);
        }

        System.out.print("Quantos estudantes matriculados no curso B? ");
        entrada = scanner.nextInt();
        for (int i = 0; i < entrada; i++){
            int numeroUsuario = scanner.nextInt();
            cursoB.add(numeroUsuario);
        }

        System.out.print("Quantos estudantes matriculados no curso C? ");
        entrada = scanner.nextInt();
        for (int i = 0; i < entrada; i++){
            int numeroUsuario = scanner.nextInt();
            cursoC.add(numeroUsuario);
        }

        Set<Integer> totalAlunos = new HashSet<>();
        totalAlunos.addAll(cursoA);
        totalAlunos.addAll(cursoB);
        totalAlunos.addAll(cursoC);

        System.out.println("Total de estudantes: " + totalAlunos.size());

        scanner.close();
    }
}
