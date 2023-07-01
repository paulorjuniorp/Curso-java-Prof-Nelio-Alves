package org.example.exercicio15genericsetmap.exemplos.application;

import org.example.exercicio15genericsetmap.exemplos.model.entities.Circle;
import org.example.exercicio15genericsetmap.exemplos.model.entities.Rectangle;
import org.example.exercicio15genericsetmap.exemplos.model.entities.Shape;

import java.util.ArrayList;
import java.util.List;

/**
 * Coringas delimitados
 * */
public class Exemplo4 {
    public static void main(String[] args) {
        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(3.0, 2.0));
        myShapes.add(new Circle(2.0));

        System.out.println("Total area: " + toralArea(myShapes));
    }

    public static double toralArea(List<Shape> list){
        double sum = 0.0;
        for (Shape s : list){
            sum += s.area();
        }

        return sum;
    }
}
