package org.example.exercicio5orientacaoaobjetos.exercicio1.entities;

public class Retangulo {
    public double altura;
    public double largura;

    public double area(){
        return this.altura * this.largura;
    }

    public double perimetro(){
        return 2*(this.altura + this.largura);
    }

    public double diagonal(){
        return Math.sqrt((this.altura * this.altura) + (this.largura * this.largura));
    }

    public String toString(){
        return "AREA = "
                + String.format("%.2f",area())
                + "\nPERIMETRO = "
                + String.format("%.2f",perimetro())
                + "\nDIAGONAL = "
                + String.format("%.2f",diagonal());
    }
}
