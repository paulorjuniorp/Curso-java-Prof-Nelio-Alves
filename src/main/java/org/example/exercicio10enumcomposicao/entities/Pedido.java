package org.example.exercicio10enumcomposicao.entities;

import org.example.exercicio10enumcomposicao.enums.StatusPedido;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {

    private static SimpleDateFormat formatoDataHora = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private static SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
    private Date momento;
    private StatusPedido statusPedido;
    private Cliente cliente;
    private List<ItemPedido> itensPedidos = new ArrayList<>();

    public Pedido() {
    }

    public Pedido(Date momento, StatusPedido statusPedido, Cliente cliente) {
        this.momento = momento;
        this.statusPedido = statusPedido;
        this.cliente = cliente;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public StatusPedido getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(StatusPedido statusPedido) {
        this.statusPedido = statusPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemPedido> getItensPedidos() {
        return itensPedidos;
    }

    public void addItemPedido(ItemPedido itemPedido){
        itensPedidos.add(itemPedido);
    }

    public void removeItemPedido(ItemPedido itemPedido){
        itensPedidos.remove(itemPedido);
    }

    public double total(){
        double somaTotal = 0;
        for (ItemPedido itensPedido : itensPedidos) {
            somaTotal += itensPedido.subTotal();
        }

        return somaTotal;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hora do pedido: ");
        sb.append(formatoDataHora.format(momento) + "\n");
        sb.append("Status do pedido: ");
        sb.append(statusPedido + "\n");
        sb.append("Cliente: ");
        sb.append(cliente.getNome() + " (");
        sb.append(formatoData.format(cliente.getDataNascimento()) + ") - ");
        sb.append(cliente.getEmail() + "\n");
        sb.append("Itens do pedido: \n");
        for (ItemPedido itensPedido : itensPedidos) {
            sb.append(itensPedido.getProduto().getNome() + ", R$ ");
            sb.append(String.format("%.2f",itensPedido.getProduto().getPreco()));
            sb.append(", Quantidade: " + itensPedido.getQuantidade());
            sb.append(", SubTotal: R$" + String.format("%.2f",itensPedido.subTotal()) + "\n");
        }
        sb.append(String.format("Total: %.2f",total()));

        return sb.toString();
    }
}
