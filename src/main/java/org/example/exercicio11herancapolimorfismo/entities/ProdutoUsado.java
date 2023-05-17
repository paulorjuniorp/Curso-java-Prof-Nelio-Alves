package org.example.exercicio11herancapolimorfismo.entities;

import java.util.Date;

public class ProdutoUsado extends Produto {
    private Date dataFabricacao;

    public ProdutoUsado() {
        super();
    }

    public ProdutoUsado(String nome, Double preco, Date dataFabricacao) {
        super(nome, preco);
        this.dataFabricacao = dataFabricacao;
    }

    public Date getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(Date dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    @Override
    public String tagPreco() {
        return super.tagPreco();
    }
}
