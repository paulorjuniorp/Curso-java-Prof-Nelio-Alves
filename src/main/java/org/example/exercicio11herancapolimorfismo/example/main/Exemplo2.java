package org.example.exercicio11herancapolimorfismo.example.main;

import org.example.exercicio11herancapolimorfismo.example.entities.Circle;
import org.example.exercicio11herancapolimorfismo.example.entities.Rectangle;
import org.example.exercicio11herancapolimorfismo.example.entities.Shape;
import org.example.exercicio11herancapolimorfismo.example.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Fazer um programa para ler os dados de N figuras (N fornecido pelo usuário), e depois mostrar as áreas
 * destas figuras na mesma ordem em que foram digitadas.
 * */
public class Exemplo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Shape> formas = new ArrayList<>();


        System.out.print("Enter the number of shapes: ");
        int entrada = scanner.nextInt();

        for (int i = 1; i <= entrada; i++){
            System.out.printf("Shape #%d data: %n", i);
            System.out.print("Rectangle or Circle (r/c)? ");
            scanner.nextLine();
            char shapeType = scanner.nextLine().charAt(0);
            System.out.print("Color (BLACK/ BLUE/ RED): ");
            Color color = Color.valueOf(scanner.nextLine());
            switch (shapeType){
                case 'r':
                    System.out.print("Width: ");
                    double width = scanner.nextDouble();
                    System.out.print("Heigth: ");
                    double height = scanner.nextDouble();
                    Shape rectangle = new Rectangle(color, width, height);
                    formas.add(rectangle);
                    break;
                case 'c':
                    System.out.print("Radius: ");
                    double radius = scanner.nextDouble();
                    Shape circle = new Circle(color,radius);
                    formas.add(circle);
                    break;
                default:
                    System.out.println("Invalid option!");
                    break;
            }
        }

        System.out.println("\n");
        System.out.println("Shape Areas: ");
        for (Shape forma : formas) {
            System.out.println(forma);
        }
        scanner.close();
    }
}
