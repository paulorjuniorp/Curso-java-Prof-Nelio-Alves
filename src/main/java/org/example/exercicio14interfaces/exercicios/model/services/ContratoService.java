package org.example.exercicio14interfaces.exercicios.model.services;

import org.example.exercicio14interfaces.exercicios.model.entities.Contrato;
import org.example.exercicio14interfaces.exercicios.model.entities.Parcela;

import java.time.LocalDate;

public class ContratoService {
    private PagamentoOnlineService pagamentoOnlineService;

    public ContratoService(PagamentoOnlineService pagamentoOnlineService) {
        this.pagamentoOnlineService = pagamentoOnlineService;
    }

    public void processoContrato(Contrato contrato, int meses){

        double parcelaBasica = contrato.getValorContrato() / meses;

        for (int i = 1; i <= meses; i++){
            LocalDate dataVencimento = contrato.getDataContrato().plusMonths(i);

            double juro = pagamentoOnlineService.juros(parcelaBasica, i);
            double taxa = pagamentoOnlineService.taxaPagamento(parcelaBasica + juro);
            double parcela = parcelaBasica + juro + taxa;

            contrato.getParcelas().add(new Parcela(parcela, dataVencimento));
        }

    }
}
