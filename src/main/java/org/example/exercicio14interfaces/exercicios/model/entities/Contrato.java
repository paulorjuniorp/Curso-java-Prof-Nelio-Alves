package org.example.exercicio14interfaces.exercicios.model.entities;

import java.time.LocalDate;
import java.util.List;

public class Contrato {
    private Long numeroContrato;
    private LocalDate dataContrato;
    private Double valorContrato;
    private List<Parcela> parcelas;

    public Contrato(Long numeroContrato, LocalDate dataContrato, Double valorContrato) {
        this.numeroContrato = numeroContrato;
        this.dataContrato = dataContrato;
        this.valorContrato = valorContrato;
    }

    public Long getNumeroContrato() {
        return numeroContrato;
    }

    public void setNumeroContrato(Long numeroContrato) {
        this.numeroContrato = numeroContrato;
    }

    public LocalDate getDataContrato() {
        return dataContrato;
    }

    public void setDataContrato(LocalDate dataContrato) {
        this.dataContrato = dataContrato;
    }

    public Double getValorContrato() {
        return valorContrato;
    }

    public void setValorContrato(Double valorContrato) {
        this.valorContrato = valorContrato;
    }

    public List<Parcela> getParcelas() {
        return parcelas;
    }

    public void setParcelas(List<Parcela> parcelas) {
        this.parcelas = parcelas;
    }
}
