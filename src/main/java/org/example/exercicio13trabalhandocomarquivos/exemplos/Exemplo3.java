package org.example.exercicio13trabalhandocomarquivos.exemplos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Utilizando try-with-resources para simplificar a escrita de código
public class Exemplo3 {
    public static void main(String[] args) {
        String path = "c:\\temp\\in.txt";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String linha = bufferedReader.readLine();
            while (linha != null){
                System.out.println(linha);
                linha = bufferedReader.readLine();
            }
        } catch (IOException e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
