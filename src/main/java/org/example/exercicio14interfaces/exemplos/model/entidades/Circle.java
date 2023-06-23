package org.example.exercicio14interfaces.exemplos.model.entidades;

import org.example.exercicio11herancapolimorfismo.example.enums.Color;

public class Circle extends AbstractShape{
    private Double raio;

    public Circle(Color color, double raio) {
        super(color);
        this.raio = raio;
    }

    @Override
    public double area() {
        return Math.PI * raio;
    }
}
