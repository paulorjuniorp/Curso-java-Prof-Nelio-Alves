package org.example.exercicio5orientacaoaobjetos.exercicio3.main;

import org.example.exercicio5orientacaoaobjetos.exercicio3.entities.Estudante;

import java.util.Locale;
import java.util.Scanner;

/**
 * Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano (primeiro
 * trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no ano. Dizer
 * também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam para o aluno obter
 * o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Estudante para resolver este problema.
 * */
public class Exercicio3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Estudante estudante = new Estudante();

        estudante.nome = scanner.nextLine();
        estudante.notaPrimeiroTrimestre = scanner.nextDouble();
        estudante.notaSegundoTrimestre = scanner.nextDouble();
        estudante.notaTerceiroTrimestre = scanner.nextDouble();

        System.out.println("FINAL GRADE: " + estudante.notaFinal());

        estudante.resultado();
    }
}
