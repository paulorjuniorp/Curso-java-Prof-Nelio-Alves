package org.example.exercicio13trabalhandocomarquivos.exemplos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

// FileWriter e BufferedWriter
public class Exemplo4 {
    public static void main(String[] args) {
        String[] lines = new String[] {"Bom dia","Boa tarde", "Boa noite"};
        String path = "c:\\temp\\out.txt";

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true))){
            for (String line : lines){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        }catch (IOException e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
