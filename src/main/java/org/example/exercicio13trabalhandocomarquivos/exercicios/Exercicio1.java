package org.example.exercicio13trabalhandocomarquivos.exercicios;

import org.example.exercicio13trabalhandocomarquivos.exercicios.entities.Produto;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 * Fazer um programa para ler o caminho de um arquivo .csv contendo os dados de itens vendidos. Cada item
 * possui um nome, preço unitário e quantidade, separados por vírgula. Você deve gerar um novo arquivo
 * chamado "summary.csv", localizado em uma subpasta chamada "out" a partir da pasta original do arquivo
 * de origem, contendo apenas o nome e o valor total para aquele item (preço unitário multiplicado pela
 * quantidade), conforme exemplo.
 *
 * source file:
 * TV LED, 1290.99, 1
 * Video Game Chair, 350.50, 3
 * Iphone X, 900.00, 2
 * Samsung Galaxy 9, 850.00, 2
 *
 * output file (out/summary.csv):
 * TV LED, 1290.99
 * Video Game Chair, 1051.50
 * Iphone X, 1800.00
 * Samsung Galaxy 9, 1700.00
 *
 * */
public class Exercicio1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        List<Produto> produtos = new ArrayList<>();

        System.out.println("Digite o caminho do arquivo: ");
        String arquivoOrigemStr = scanner.nextLine();

        File arquivoOrigem = new File(arquivoOrigemStr);
        String pastaOrigemStr = arquivoOrigem.getParent();

        boolean sucesso = new File(pastaOrigemStr+"\\out").mkdir();

        String arquivoDestinoStr = pastaOrigemStr + "\\out\\summary.csv";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(arquivoOrigemStr))) {
            String produtoLido = bufferedReader.readLine();
            while (produtoLido != null){
                String[] camposArquivo = produtoLido.split(",");
                String nome = camposArquivo[0];
                Double preco = Double.parseDouble(camposArquivo[1]);
                Integer quantidade = Integer.parseInt(camposArquivo[2]);

                produtos.add(new Produto(nome, preco, quantidade));

                produtoLido = bufferedReader.readLine();
            }

            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(arquivoDestinoStr))) {
                for (Produto produto : produtos) {
                    bufferedWriter.write(produto.getNome() + ", " + String.format("%.2f",produto.total()));
                    bufferedWriter.newLine();
                }

                System.out.println(arquivoDestinoStr + " criado com sucesso");
            } catch (IOException e){
                e.printStackTrace();
            }

        } catch (IOException e){
            e.printStackTrace();
        }
        scanner.close();
    }
}
