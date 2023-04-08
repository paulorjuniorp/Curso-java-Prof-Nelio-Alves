package org.example.exercicio6construtores.entities;

public class ContaBancaria {
    private int numeroDaConta;
    private String nome;
    private double saldo;

    public ContaBancaria(int numeroDaConta, String nome, double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.nome = nome;
        this.saldo = saldo;
    }

    public ContaBancaria(int numeroDaConta, String nome) {
        this.numeroDaConta = numeroDaConta;
        this.nome = nome;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void deposito(double deposito){
        this.saldo += deposito;
    }

    public void saque(double saque){
        this.saldo -= (saque + 5.00);
    }

    @Override
    public String toString() {
        return "Conta " +
                numeroDaConta +
                ", Titular: " + nome +
                ", Saldo: R$ " + String.format("%.2f",saldo);
    }
}
