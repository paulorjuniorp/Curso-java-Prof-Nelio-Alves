package org.example.exercicio14interfaces.exemplos.model.services;

public class BrazilInterestService {

    private Double taxaJuros;

    public BrazilInterestService(Double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public double payment(double amount, int months) {
        return 0;
    }
}
