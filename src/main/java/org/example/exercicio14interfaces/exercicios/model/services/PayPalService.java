package org.example.exercicio14interfaces.exercicios.model.services;

public class PayPalService implements PagamentoOnlineService {
    @Override
    public double taxaPagamento(double quantia) {
        return quantia * 0.02;
    }

    @Override
    public double juros(double quantia, int meses) {
        return quantia * 0.01 * meses;
    }
}
