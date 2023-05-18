package org.example.exercicio11herancapolimorfismo.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto {

    private static SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
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
        StringBuilder sb = new StringBuilder();
        sb.append(getNome()
                + " (usado) R$ "
                + getPreco()
                + "(Data de fabricação: "
                + formatoData.format(dataFabricacao)
                + ")");

        return sb.toString();
    }
}
