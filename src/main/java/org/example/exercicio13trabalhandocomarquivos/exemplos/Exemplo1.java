package org.example.exercicio13trabalhandocomarquivos.exemplos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        File file = new File("c:\\tempo\\in.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e){
            System.out.println("Erro: " + e.getMessage());
        } finally {
            if (scanner != null){
                scanner.close();
            }
        }
    }
}
