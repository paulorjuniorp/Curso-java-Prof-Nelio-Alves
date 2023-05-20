package org.example.exercicio11herancapolimorfismo.entities;

public class PessoaFisica extends Contribuinte {

    private Double gastosComSaude;

    public PessoaFisica() {
        super();
    }

    public PessoaFisica(String nome, double rendaAnual, Double gastosComSaude) {
        super(nome, rendaAnual);
        this.gastosComSaude = gastosComSaude;
    }

    public Double getGastosComSaude() {
        return gastosComSaude;
    }

    public void setGastosComSaude(Double gastosComSaude) {
        this.gastosComSaude = gastosComSaude;
    }

    @Override
    public double imposto() {
        if (getRendaAnual() < 20000){
            return getRendaAnual() * 0.15;
        }else{
            if (gastosComSaude > 0){
                return (getRendaAnual() * 0.25) - (gastosComSaude * 0.5);
            } else {
                return getRendaAnual() * 0.25;
            }
        }
    }
}
