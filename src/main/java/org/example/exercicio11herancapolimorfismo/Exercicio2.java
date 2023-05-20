package org.example.exercicio11herancapolimorfismo;

import org.example.exercicio11herancapolimorfismo.entities.Contribuinte;
import org.example.exercicio11herancapolimorfismo.entities.PessoaFisica;
import org.example.exercicio11herancapolimorfismo.entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Contribuinte contribuinte;
        List<Contribuinte> contribuintes = new ArrayList<>();

        System.out.print("Digite a quantidade de contribuites: ");
        int entrada = scanner.nextInt();

        for (int i = 1; i <= entrada; i++){
            System.out.printf("Dados do contribuinte #%d%n",i);
            System.out.print("Pessoa física ou juridica (f/j)? ");
            scanner.nextLine();
            char opcao = scanner.nextLine().charAt(0);
            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Renda anual: ");
            double rendaAnual = scanner.nextDouble();

            switch (opcao){
                case 'f':
                    scanner.nextLine();
                    System.out.print("Gastos com saúde: ");
                    double gastoComSaude = scanner.nextDouble();

                    contribuinte = new PessoaFisica(nome,rendaAnual,gastoComSaude);
                    contribuintes.add(contribuinte);
                    break;
                case 'j':
                    System.out.print("Número de funcionários: ");
                    int numeroDeFuncionarios = scanner.nextInt();

                    contribuinte = new PessoaJuridica(nome,rendaAnual,numeroDeFuncionarios);
                    contribuintes.add(contribuinte);
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }

        System.out.println();
        System.out.println("IMPOSTOS PAGOS: ");
        for (Contribuinte contribuinteImpressao : contribuintes) {
            System.out.println(contribuinteImpressao.getNome() + String.format(": R$ %.2f",contribuinteImpressao.imposto()));
        }

        double somaTaxa = 0;
        for (Contribuinte contribuinteSomaTaxa : contribuintes) {
            somaTaxa += contribuinteSomaTaxa.imposto();
        }

        System.out.println();
        System.out.println("Total de impostos: R$ " + String.format("%.2f",somaTaxa));

        scanner.close();
    }
}
