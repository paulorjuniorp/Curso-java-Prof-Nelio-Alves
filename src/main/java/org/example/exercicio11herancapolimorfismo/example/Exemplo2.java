package org.example.exercicio11herancapolimorfismo.example;

import org.example.exercicio11herancapolimorfismo.example.entities.Circle;
import org.example.exercicio11herancapolimorfismo.example.entities.Rectangle;
import org.example.exercicio11herancapolimorfismo.example.entities.Shape;

import java.util.ArrayList;
import java.util.List;

public class Exemplo2 {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(6.4, 2.0);
        Shape circle = new Circle(8.5);
        List<Shape> formas = new ArrayList<>();

        formas.add(rectangle);
        formas.add(circle);

        for (Shape forma : formas) {
            System.out.println(forma.area());
        }

    }
}
