package org.example.exercicio11herancapolimorfismo.entities;

public class PessoaJuridica extends Contribuinte {

    private int numeroDeFuncionarios;

    public PessoaJuridica() {
        super();
    }

    public PessoaJuridica(String nome, double rendaAnual, int numeroDeFuncionarios) {
        super(nome, rendaAnual);
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }

    public int getNumeroDeFuncionarios() {
        return numeroDeFuncionarios;
    }

    public void setNumeroDeFuncionarios(int numeroDeFuncionarios) {
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }

    @Override
    public double imposto() {
        if (numeroDeFuncionarios < 10){
            return getRendaAnual() * 0.16;
        } else {
            return getRendaAnual() * 0.14;
        }
    }
}
