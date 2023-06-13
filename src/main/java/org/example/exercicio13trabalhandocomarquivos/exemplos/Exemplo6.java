package org.example.exercicio13trabalhandocomarquivos.exemplos;

import java.io.File;
import java.util.Scanner;

// Informações sobre caminhos de arquivos e diretórios
public class Exemplo6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o caminho de uma pasta: ");
        String strPath = scanner.nextLine();

        File path = new File(strPath);

        System.out.println("getPath: " + path.getPath());
        System.out.println("getParent: " + path.getParent());
        System.out.println("getName: " + path.getName());

        scanner.close();
    }
}
