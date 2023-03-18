package org.example.entradaDeDados;

import java.util.Scanner;

public class MainEntradaDados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        System.out.println(x);

        int i = sc.nextInt();
        System.out.println(i);

        double d = sc.nextDouble();
        System.out.println(d);

        String nome = sc.next();
        int idade = sc.nextInt();
        double media = sc.nextDouble();

        System.out.println("O aluno " + nome + " tem a idade de " + idade + " anos e sua média é: " + media);
        sc.close();
    }
}
