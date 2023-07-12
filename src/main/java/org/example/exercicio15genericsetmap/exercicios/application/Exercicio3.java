package org.example.exercicio15genericsetmap.exercicios.application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Na contagem de votos de uma eleição, são gerados vários registros de votação contendo o nome do candidato e a
 * quantidade de votos (formato .csv) que ele obteve em uma urna de votação. Você deve fazer um programa para ler os
 * registros de votação a partir de um arquivo, e daí gerar um relatório consolidado com os totais de cada candidato.
 * */
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> maps = new HashMap<>();

        System.out.print("Digite o caminho completo do arquivo: ");
        String path = scanner.nextLine();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){
            String line = bufferedReader.readLine();
            while (line != null){
                String[] lines = line.split(",");
                String candidato = lines[0];
                Integer votos = Integer.parseInt(lines[1]);

                if (maps.containsKey(candidato)){
                    int votosAteMomento = maps.get(candidato);
                    maps.put(candidato, votos + votosAteMomento);
                } else {
                    maps.put(candidato, votos);
                }

                line = bufferedReader.readLine();
            }

            for (String key : maps.keySet()) {
                System.out.println(key + ": " + maps.get(key));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        scanner.close();
    }
}
