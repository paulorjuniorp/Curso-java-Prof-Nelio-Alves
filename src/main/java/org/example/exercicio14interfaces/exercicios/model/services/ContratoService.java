package org.example.exercicio14interfaces.exercicios.model.services;

import org.example.exercicio14interfaces.exercicios.model.entities.Contrato;
import org.example.exercicio14interfaces.exercicios.model.entities.Parcela;

public class ContratoService {
    private PagamentoOnlineService pagamentoOnlineService;

    public ContratoService(PagamentoOnlineService pagamentoOnlineService) {
        this.pagamentoOnlineService = pagamentoOnlineService;
    }

    public void processoContrato(Contrato contrato, Integer parcelas){
        contrato.getParcelas().add(new Parcela());
    }
}
