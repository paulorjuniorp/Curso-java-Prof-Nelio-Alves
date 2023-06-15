package org.example.exercicio14interfaces.exemplos.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

/**
 * Uma locadora brasileira de carros cobra um valor por hora para locações de até 12 horas. Porém, se a
 * duração da locação ultrapassar 12 horas, a locação será cobrada com base em um valor diário. Além do valor
 * da locação, é acrescido no preço o valor do imposto conforme regras do país que, no caso do Brasil, é 20%
 * para valores até 100.00, ou 15% para valores acima de 100.00. Fazer um programa que lê os dados da locação
 * (modelo do carro, instante inicial e final da locação), bem como o valor por hora e o valor diário de locação.
 * O programa deve então gerar a nota de pagamaneto (contendo o valor da locação, valor do imposto e valor
 * total do pagamento) e informar os dados na tela. Veja os exemplos.
 *
 * Entre com os dados do aluguel
 * Modelo do carro: Civic
 * Retirada (dd/MM/yyyy hh:mm): 25/06/2018 10:30
 * Retorno (dd/MM/yyyy hh:mm): 25/06/2018 14:40
 * Entre com o preço por hora: 10.00
 * Entre com o preço por dia: 130.00
 * FATURA:
 * Pagamento basico: 50.00
 * Imposto: 10.00
 * Pagamento total: 60.00
 *
 * Entre com os dados do aluguel
 * Modelo do carro: Civic
 * Retirada (dd/MM/yyyy hh:mm): 25/06/2018 10:30
 * Retorno (dd/MM/yyyy hh:mm): 27/06/2018 11:40
 * Entre com o preço por hora: 10.00
 * Entre com o preço por dia: 130.00
 * FATURA:
 * Pagamento basico: 390.00
 * Imposto: 58.50
 * Pagamento total: 448.50
 *
 * */
public class Exemplo1 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatoDataHora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel");
        System.out.print("Modelo do carro: ");
        String modelo = scanner.nextLine();
        System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
        LocalDateTime inicio = LocalDateTime.parse(scanner.nextLine(), formatoDataHora);
        System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
        LocalDateTime fim = LocalDateTime.parse(scanner.nextLine(), formatoDataHora);
        System.out.print("Entre com o preço por hora: ");
        double precoHora = scanner.nextDouble();
        System.out.print("Entre com o preço por dia: ");
        double precoDia = scanner.nextDouble();
        System.out.println("FATURA: ");

    }
}
