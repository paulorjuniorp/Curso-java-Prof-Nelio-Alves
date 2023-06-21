package org.example.exercicio14interfaces.exercicios.model.services;

import org.example.exercicio14interfaces.exercicios.model.entities.Contrato;

public class ContratoService implements PagamentoOnlineService {
    public void processoContrato(Contrato contrato, Integer parcelas){

    }

    @Override
    public double taxaPagamento(double quantia) {
        return 0;
    }

    @Override
    public double interesse(double quantia, int meses) {
        return 0;
    }
}
