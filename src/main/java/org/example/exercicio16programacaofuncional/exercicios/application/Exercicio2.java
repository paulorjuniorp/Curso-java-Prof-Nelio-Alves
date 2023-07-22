package org.example.exercicio16programacaofuncional.exercicios.application;

import org.example.exercicio16programacaofuncional.exercicios.model.entities.Funcionario;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * Fazer um programa para ler os dados (nome, email e salario) de funcionários a partir de um arquivo em formato .csv
 *
 * Em seguida mostrar, em ordem alfabética, o email dos funcionários cujo salário seja superior a um dado valor fornecido
 * pelo usuário.
 *
 * Mostrar também a soma dos salários dos funcionários cujo nome começa com a letra 'M'.
 *
 *
 * */

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o caminho completo para o arquivo: ");
        String path = scanner.nextLine();
        System.out.print("Digite o salário: ");
        double salario = scanner.nextDouble();

        List<Funcionario> funcionarios = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){
            String linha = bufferedReader.readLine();
            while (linha != null){
                String[] campos = linha.split(",");
                funcionarios.add(new Funcionario(campos[0],campos[1],Double.parseDouble(campos[2])));

                linha = bufferedReader.readLine();
            }

            Comparator<String> emailsComparator = (e1, e2) -> e1.toUpperCase().compareTo(e2.toUpperCase());

            List<String> emails = funcionarios.stream()
                    .filter(funcionario -> funcionario.getSalario() > salario)
                    .map(Funcionario::getEmail)
                    .sorted(emailsComparator)
                    .toList();

            System.out.printf("E-mail de pessoas cujo salário é superior a %f:%n",salario);
            emails.forEach(System.out::println);

            Double soma = funcionarios.stream()
                    .filter(funcionario -> funcionario.getEmail().charAt(0) == 'M')
                    .map(Funcionario::getSalario)
                    .reduce(0.0, Double::sum);

            System.out.printf("Soma do salário das pessoas cujo nome começa com 'M': %.2f",soma);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
