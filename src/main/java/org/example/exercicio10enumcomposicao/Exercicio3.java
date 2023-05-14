package org.example.exercicio10enumcomposicao;

import org.example.exercicio10enumcomposicao.entities.Cliente;
import org.example.exercicio10enumcomposicao.entities.ItemPedido;
import org.example.exercicio10enumcomposicao.entities.Pedido;
import org.example.exercicio10enumcomposicao.entities.Produto;
import org.example.exercicio10enumcomposicao.enums.StatusPedido;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Ler os dados de um pedido com N itens (N fornecido pelo usuário). Depois, mostrar um sumário do pedido conforme
 * exmplo (próxima página). Nota: o instante do pedido deve ser o instante do sistema: new Date()
 *
 * Digite os dados do cliente:
 * Nome: Alex Green
 * Email: alex@gmail.com
 * Data de nascimento (DD/MM/YYYY): 15/03/1985
 *
 * Digite os dados do pedido:
 * Status: PROCESSANDO
 *
 * QUANTOS ITEMS PARA ESTE PEDIDO? 2
 * DIGITE OS DADOS DO ITEM #1
 * NOME DO PRODUTO: TV
 * PRECO DO PRODUTO: 1000,00
 * QUANTIDADE: 1
 *
 * DIGITE OS DADOS DO ITEM #2
 *  * NOME DO PRODUTO: MOUSE
 *  * PRECO DO PRODUTO: 40,00
 *  * QUANTIDADE: 2
 *
 *  RESUMO
 *  HORA DO PEDIDO: XX/XX/XXXX XX:XX:XX
 *  STATUS DO PEDIDO: PRECESSANDO
 *  CLIENTE: ALEX GREEN (15/03/1985) - alex@gmail.com
 *  ITENS DO PEDIDO:
 *  TV, R$ 1000,00, QUANTIDADE: 1, SUBTOTAL R$1000,00
 *  MOUSE, R$ 40,00, QUANTIDADE: 2, SUBTOTAL: R$80,00
 *  PREÇO TOTAL: R$ 1080,00
 * */
public class Exercicio3 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
        Pedido pedido = new Pedido();
        pedido.setMomento(new Date());

        System.out.println("Digite os dados do cliente:");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Data de nascimento (DD/MM/YYYY): ");
        Date dataNascimento = formatoData.parse(scanner.next());

        Cliente cliente = new Cliente(nome,email,dataNascimento);
        pedido.setCliente(cliente);

        System.out.println("Digite os dados do pedido: ");
        System.out.print("Status: ");
        StatusPedido statusPedido = StatusPedido.valueOf(scanner.nextLine());
        pedido.setStatusPedido(statusPedido);

        System.out.print("Quanto itens para este pedido? ");
        int qtdPedidos = scanner.nextInt();
        for (int i = 1; i <= qtdPedidos; i++){
            System.out.println("Digite os dados do item #" + i);
            scanner.nextLine();
            System.out.print("Nome do produto: ");
            String nomeProduto = scanner.nextLine();
            System.out.print("Preço do produto: ");
            double precoProduto = scanner.nextDouble();
            System.out.print("Quantidade: ");
            int quantidade = scanner.nextInt();

            Produto produto = new Produto(nomeProduto,precoProduto);
            ItemPedido itemPedido = new ItemPedido(quantidade,precoProduto,produto);
            pedido.addItemPedido(itemPedido);
        }

        System.out.println("Resumo");

    }
}
