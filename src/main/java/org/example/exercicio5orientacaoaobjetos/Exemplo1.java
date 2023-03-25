package org.example.exercicio5orientacaoaobjetos;

import org.example.exercicio5orientacaoaobjetos.entities.Produto;

import java.util.Locale;
import java.util.Scanner;

/**
 * Fazer um programa para ler os dados de um produto em estoque (nome, preço e quantidade no estoque). Em seguida:
 * Mostrar os dados do produto (nome, preço, quantidade no estoque, valor total no estoque)
 * Realizar uma entrada no estoque e mostrar novamente os dados do produto
 * Realizar uma saída no estoque e mostrar novamente os dados do produto
 * */
public class Exemplo1 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Produto produto = new Produto();

        System.out.println("Digite os dados do produto");
        System.out.print("Nome: ");
        produto.nome = scanner.next();

        System.out.print("Preço: ");
        produto.preco = scanner.nextDouble();

        System.out.print("Quantidade: ");
        produto.quantidade = scanner.nextInt();

        System.out.println();
        System.out.println("Dados do produto: " + produto);

        System.out.println();
        System.out.print("Entre com o número de produtos a serem adicionados no estoque: ");
        int quantidade = scanner.nextInt();
        produto.adicionaProdutos(quantidade);

        System.out.println();
        System.out.println("Atualização de " + produto);

        System.out.println();
        System.out.print("Entre com o número de produtos a serem removidos no estoque: ");
        quantidade = scanner.nextInt();
        produto.removeProdutos(quantidade);

        System.out.println();
        System.out.println("Atualização final de " + produto);

        scanner.close();
    }
}
