package org.example.exercicio12tratamentoexcecoes.exercicios.model.entities;

import org.example.exercicio12tratamentoexcecoes.exercicios.model.exceptions.SaqueExeption;

public class Conta {
    private Integer numeroConta;
    private String titular;
    private Double saldo;
    private Double limiteSaque;

    public Conta() {
    }

    public Conta(Integer numeroConta, String titular, Double saldo, Double limiteSaque) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Double getLimiteSaque() {
        return limiteSaque;
    }

    public void deposito(double valorDeposito){
        saldo += valorDeposito;
    }

    public void saque(double saque) throws SaqueExeption {
        if (saldo <= 0){
            throw new SaqueExeption("Saldo insuficiente");
        }

        if (saque > limiteSaque){
            throw new SaqueExeption("O valor de saque excede o valor limite de saque");
        }

        saldo -= saque;
    }
}
