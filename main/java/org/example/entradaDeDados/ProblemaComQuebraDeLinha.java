package org.example.entradaDeDados;

import java.util.Scanner;

public class ProblemaComQuebraDeLinha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        //Esse ponto entre o nextInt e o nextLine vai gerar um problema, pois a quebra de linha após o nextInt fica na
        //memória, e o próximo nextLine acaba fazendo a leitura da quebra de linha e indo para o próximo. Então é necessário
        //colocar um nextLine sozinho para absorver essa quebra de linha e o programa seguir o fluxo correto
        sc.nextLine();
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();

        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
