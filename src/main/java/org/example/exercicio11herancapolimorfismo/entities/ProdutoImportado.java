package org.example.exercicio11herancapolimorfismo.entities;

public class ProdutoImportado extends Produto {
    private Double taxaAlfandega;

    public ProdutoImportado() {
        super();
    }

    public ProdutoImportado(String nome, Double preco, Double taxaAlfandega) {
        super(nome, preco);
        this.taxaAlfandega = taxaAlfandega;
    }

    public Double getTaxaAlfandega() {
        return taxaAlfandega;
    }

    public void setTaxaAlfandega(Double taxaAlfandega) {
        this.taxaAlfandega = taxaAlfandega;
    }

    @Override
    public String tagPreco() {
        StringBuilder sb = new StringBuilder();
        sb.append(getNome() + " R$ " + getPreco() + " (Taxas alfandegárias: R$ " + taxaAlfandega + ")");
        return sb.toString();
    }

    public double precoTotal(){
        return getPreco() + taxaAlfandega;
    }
}
