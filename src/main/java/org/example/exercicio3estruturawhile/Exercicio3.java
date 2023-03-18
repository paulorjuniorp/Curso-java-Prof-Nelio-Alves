package org.example.exercicio3estruturawhile;

import java.util.Scanner;

/**
 * Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva um algo-
 * ritmo para ler o tipo de combustível abastecido (Codificado da seguinte forma: 1. Álcool 2. Gasolina 3. Diesel 4. Fim).
 * Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até que seja
 * válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a mensagem: "MUITO OBRI-
 * GADO" e a quantidade de clientes que abasteceram cada tipo de combustivel, conforma exemplo.
 * */
public class Exercicio3 {
    public static void main(String[] args) {
        System.out.println("1. Álcool 2.Gasolina 3.Diesel 4.Fim");
        Scanner scanner = new Scanner(System.in);

        int opcao = scanner.nextInt();

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (opcao != 4){
            if (opcao == 1){
                alcool++;
            }else if (opcao == 2){
                gasolina++;
            } else if (opcao == 3) {
                diesel++;
            }
            opcao = scanner.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.printf("Alcool: %d%n",alcool);
        System.out.printf("Gasolina: %d%n",gasolina);
        System.out.printf("Diesel: %d%n",diesel);

        scanner.close();
    }
}
