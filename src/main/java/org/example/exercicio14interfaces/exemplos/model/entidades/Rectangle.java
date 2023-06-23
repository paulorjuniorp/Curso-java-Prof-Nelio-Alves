package org.example.exercicio14interfaces.exemplos.model.entidades;

import org.example.exercicio11herancapolimorfismo.example.enums.Color;

public class Rectangle extends AbstractShape {

    private Double altura;
    private Double largura;

    public Rectangle(Color color, Double altura, Double largura) {
        super(color);
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    public double area() {
        return altura * largura;
    }
}
