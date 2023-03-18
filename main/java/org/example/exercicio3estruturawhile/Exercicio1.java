package org.example.exercicio3estruturawhile;

import java.util.Scanner;

/**
 * Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha incorreta
 * informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser impressa a men-
 * sagem "Acesso permitido" e o algorítmo encerrado. Considere que a senha correta é o valor 2002
 * */
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int senhaCorreta = 2002;
        int senhaDigitadaUsuario = scanner.nextInt();

        while (senhaDigitadaUsuario != senhaCorreta){
            System.out.println("Senha Inválida");
            senhaDigitadaUsuario = scanner.nextInt();
        }

        System.out.println("Acesso Permitido");

        scanner.close();
    }
}
