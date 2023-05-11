package org.example.exercicio10enum;

import org.example.exercicio10enum.entities.ContratoHora;
import org.example.exercicio10enum.entities.Departamento;
import org.example.exercicio10enum.entities.Trabalhador;
import org.example.exercicio10enum.enums.TrabalhadorNivel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Ler os dados de um trabalhador com N contratos (N fornecido pelo usuário). Depois, solicitar do usuário um mês e mostrar
 * qual foi o salário do funcionário nesse mês, conforme exemplo
 *
 * Entre com o nome do departamento:
 * Entre com os dados do trabalhador:
 * Nome:
 * Nivel:
 * Salário base:
 * Quanto contratos tem esse trabalhador?:
 * Digite os dodos do #N contrato
 * Data (DD/MM/YYYY):
 * Valor por hora:
 * Duracao (hora):
 *
 * Digite o mês e ano para calcular o salário (MM/YYYY):
 * Nome:
 * Departamento:
 * salário por mm/yyyy:
 *
 * */
public class Exercicio1 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
        Departamento departamento = new Departamento();


        System.out.print("Digite o nome do departamento: ");
        String nomeDepartamento = scanner.nextLine();
        departamento.setNome(nomeDepartamento);

        System.out.println("Digite os dados do funcionário: ");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Nível: ");
        String nivel = scanner.nextLine();
        System.out.println("Salário base: ");
        double salarioBase = scanner.nextDouble();
        scanner.nextLine();

        Trabalhador trabalhador = new Trabalhador(nome, TrabalhadorNivel.valueOf(nivel),salarioBase,departamento);

        System.out.print("Quantos contratos tem o trabalhador " + trabalhador.getNome()+"? ");
        double qtdContratos = scanner.nextInt();
        for (int i = 1; i <= qtdContratos; i++){
            System.out.println("Digite os dados do contrato #"+i);
            System.out.println("Data (DD/MM/YYYY): ");
            Date date = formatoData.parse(scanner.next());
            System.out.print("Valor por hora: ");
            double valorHora = scanner.nextDouble();
            System.out.println("Duração (hora): ");
            int hora = scanner.nextInt();

            trabalhador.addContract(new ContratoHora(date,valorHora,hora));
        }

    }
}
