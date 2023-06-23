package org.example.exercicio14interfaces.exemplos.model.entidades;

import org.example.exercicio11herancapolimorfismo.example.enums.Color;

public class Circle extends AbstractShape{
    public Circle(Color color) {
        super(color);
    }

    @Override
    public double area() {
        return 0;
    }
}
