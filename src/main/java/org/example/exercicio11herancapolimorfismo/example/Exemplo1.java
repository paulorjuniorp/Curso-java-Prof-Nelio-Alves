package org.example.exercicio11herancapolimorfismo.example;

import org.example.exercicio11herancapolimorfismo.example.entities.Employee;
import org.example.exercicio11herancapolimorfismo.example.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Uma empresa possui funcionários próprios e terceirizados. Para cada funcionário, deseja-se registrar nome, horas
 * trabalhadas e valor por hora. Funcionários terceirizado possuem ainda uma despesa adicional.
 *
 * O pagamento dos funcionários corresponde ao valor da hora multiplicado pelas horas trabalhadas, sendo que os funcionários
 * terceirizados ainda recebem um bônus correspondente a 110% de sua despesa adicional.
 *
 * Fazer um programa para ler os dados de N funcionários (N fornecido pelo usuário) e armazená-los em uma lista. Depois de
 * ler todos os dados, mostrar nome e pagamento de cada funcionário na mesma ordem em que foram digitados.
 *
 * */
public class Exemplo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        System.out.print("Digite o número de funcionários: ");
        int entrada = scanner.nextInt();
        for (int i = 1; i <= entrada;i++){
            Employee employee;
            System.out.println("Dados do funcionário #" + i);
            System.out.print("Terceirizado (s/n)? ");
            scanner.nextLine();
            char isTerceirizado = scanner.nextLine().charAt(0);
            System.out.print("Name: ");
            String nome = scanner.nextLine();
            System.out.print("Hours: ");
            int hora = scanner.nextInt();
            System.out.print("Value per hour: ");
            double valorPorHora = scanner.nextDouble();
            if (isTerceirizado == 's'){
                System.out.print("Additional charge: ");
                double valorAdicional = scanner.nextDouble();
                employee = new OutsourcedEmployee(nome,hora,valorPorHora,valorAdicional);
                employees.add(employee);
            } else {
                employee = new Employee(nome,hora,valorPorHora);
                employees.add(employee);
            }
        }

        System.out.println("\n");
        System.out.println("Payments: ");
        for (Employee employee : employees) {
            System.out.printf("%s - R$ %.2f%n", employee.getName(), employee.payment());
        }

        scanner.close();
    }
}
