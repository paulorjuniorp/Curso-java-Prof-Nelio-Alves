package org.example.exercicio11herancapolimorfismo;

import org.example.exercicio11herancapolimorfismo.entities.Produto;
import org.example.exercicio11herancapolimorfismo.entities.ProdutoImportado;
import org.example.exercicio11herancapolimorfismo.entities.ProdutoUsado;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * Fazer um programa para ler os dados de N produtos (N fornecido pelo usuário). Ao final, mostrar a etiqueta de preço
 * de cada produto na mesma ordem em que foram digitados.
 *
 * Todos os produtos possuem nome e preço. Produtos importados possuem uma taxa de alfândega, e produtos usados possuem
 * data de fabricação. Estes dados específicos devem ser acrescentados na etiqueta de preço conforme exemplo. Para produtos
 * importados, a taxa e alfândega deve ser acrescentada ao preço final do produto.
 * */

public class Exercicio1 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
        List<Produto> produtos = new ArrayList<>();
        Produto produto;
        System.out.print("Digite o número de produtos: ");
        int qtdProduto = scanner.nextInt();

        for (int i = 1; i <= qtdProduto; i++){
            System.out.printf("Dados do produto #%d: %n",i);
            System.out.print("Comun, usado ou importado (c/u/i)? ");
            scanner.nextLine();
            char tipo = scanner.nextLine().charAt(0);
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Preco: ");
            double preco = scanner.nextDouble();

            switch (tipo){
                case 'c':
                    produto = new Produto(nome,preco);
                    produtos.add(produto);
                    break;
                case 'u':
                    System.out.print("Data de fabricação (DD/MM/AAAA): ");
                    Date dataFabricacao = formatoData.parse(scanner.next());
                    produto = new ProdutoUsado(nome,preco,dataFabricacao);
                    produtos.add(produto);
                    break;
                case 'i':
                    System.out.print("Taxa alfandegária: ");
                    double taxaAlfandegaria = scanner.nextDouble();
                    produto = new ProdutoImportado(nome,preco,taxaAlfandegaria);
                    produtos.add(produto);
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }

        System.out.println("Etiquetas de preços");
        for (Produto produtoExibicao : produtos) {
            System.out.println(produtoExibicao.tagPreco());
        }

    }
}
