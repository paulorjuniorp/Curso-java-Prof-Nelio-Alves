package org.example.exercicio14interfaces.exercicios.model.services;

public interface PagamentoOnlineService {
    double taxaPagamento(double quantia);
    double juros(double quantia, int meses);
}
