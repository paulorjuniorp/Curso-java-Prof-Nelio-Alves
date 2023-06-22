package org.example.exercicio14interfaces.exercicios.model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Parcela {

    private static DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private Double valor;
    private LocalDate dataVencimento;

    public Parcela() {
    }

    public Parcela(Double valor, LocalDate dataVencimento) {
        this.valor = valor;
        this.dataVencimento = dataVencimento;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    @Override
    public String toString() {
        return dataVencimento.format(formatoData) + " - " + String.format("%.2f", valor);
    }
}
