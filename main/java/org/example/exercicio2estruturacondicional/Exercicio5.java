package org.example.exercicio2estruturacondicional;

import java.util.Scanner;

/**
 * Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A seguir,
 * calcule e mostre o valor da conta a pagar.
 *
 * codigo | Especificação   |  Preço
 * 1      | Cachorro Quente |   R$ 4.00
 * 2      | X-Salada        |   R$ 4.50
 * 3      | X-Bacon         |   R$ 5.00
 * 4      | Torrada simples |   R$ 2.00
 * 5      | Refrigerante    |   R$ 1.50
 *
 * */
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigo = scanner.nextInt();
        int qtd = scanner.nextInt();

        double valorCompra;
        if (codigo == 1){
            valorCompra = qtd * 4;
        } else if (codigo == 2) {
            valorCompra = qtd * 4.50;
        } else if (codigo == 3) {
            valorCompra = qtd * 5;
        } else if (codigo == 4) {
            valorCompra = qtd * 2;
        } else {
            valorCompra = qtd * 1.5;
        }

        System.out.printf("Total: R$ %.2f",valorCompra);

        scanner.close();
    }
}
