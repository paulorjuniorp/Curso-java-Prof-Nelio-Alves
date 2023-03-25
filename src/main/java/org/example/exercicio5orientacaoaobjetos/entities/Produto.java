package org.example.exercicio5orientacaoaobjetos.entities;

public class Produto {
    public String nome;
    public double preco;
    public int quantidade;

    public double valorTotalEmEstoque(){
        return this.preco * this.quantidade;
    }

    public void adicionaProdutos(int quantidade){
        this.quantidade += quantidade;
    }

    public void removeProdutos(int quantidade){
        this.quantidade -= quantidade;
    }

    public String toString(){
        return "Dados do produto: "
                + this.nome
                + ", R$ "
                + String.format("%.2f",this.preco)
                + ", "
                + this.quantidade
                + " unidades, Total: R$ "
                + String.format("%.2f",valorTotalEmEstoque());
    }
}
