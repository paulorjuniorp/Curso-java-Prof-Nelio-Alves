package org.example.exercicio14interfaces.exemplos.application;

import org.example.exercicio11herancapolimorfismo.example.enums.Color;
import org.example.exercicio14interfaces.exemplos.model.entidades.AbstractShape;
import org.example.exercicio14interfaces.exemplos.model.entidades.Circle;
import org.example.exercicio14interfaces.exemplos.model.entidades.Rectangle;

public class Exemplo2 {
    public static void main(String[] args) {
        AbstractShape shape1 = new Circle(Color.BLUE, 2.0);
        AbstractShape shape2 = new Rectangle(Color.RED, 5.0,2.0);


    }
}
