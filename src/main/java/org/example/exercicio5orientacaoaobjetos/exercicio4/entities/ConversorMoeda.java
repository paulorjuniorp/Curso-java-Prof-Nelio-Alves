package org.example.exercicio5orientacaoaobjetos.exercicio4.entities;

public class ConversorMoeda {
    public static final double iof = 0.06;

    public static double conversao(double preco, int qtd){
        return preco * qtd + (preco * qtd * iof);
    }
}
