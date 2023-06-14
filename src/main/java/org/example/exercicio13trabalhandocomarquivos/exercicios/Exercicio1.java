package org.example.exercicio13trabalhandocomarquivos.exercicios;

import java.io.*;

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
        String pathIn = "C:\\teste\\teste.csv";
        String pathOut = "C:\\teste\\out";
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(pathIn));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pathOut))) {
            String linha = bufferedReader.readLine();
            while (linha != null){
                bufferedWriter.write(linha);
                bufferedWriter.newLine();

                linha = bufferedReader.readLine();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
