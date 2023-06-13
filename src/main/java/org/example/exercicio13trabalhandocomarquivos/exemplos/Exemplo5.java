package org.example.exercicio13trabalhandocomarquivos.exemplos;

import java.io.File;
import java.util.Scanner;

// Exibindo arquivos e pastas com File
public class Exemplo5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String strPath = scanner.nextLine();

        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("PASTAS: ");
        for (File folder : folders) {
            System.out.println(folder);
        }

        File[] files = path.listFiles(File::isFile);
        System.out.println("ARQUIVOS: ");
        for (File file : files) {
            System.out.println(file);
        }

        boolean success = new File(strPath + "\\subdir").mkdir();

        System.out.println("Diretório criado com sucesso: " + success);

        scanner.close();
    }
}
