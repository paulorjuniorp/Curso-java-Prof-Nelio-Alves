package org.example.exercicio13trabalhandocomarquivos.exemplos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exemplo2 {
    public static void main(String[] args) {
        String path = "c:\\temp\\in.txt";
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(path);
            // bufferedReader é uma abstração maior então recebe o fileReader como parametro
            bufferedReader = new BufferedReader(fileReader);

            String linha = bufferedReader.readLine();

            while (linha != null){
                System.out.println(linha);
                linha = bufferedReader.readLine();
            }

        } catch (IOException e){
            System.out.println("Erro: " + e.getMessage());
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }
}
