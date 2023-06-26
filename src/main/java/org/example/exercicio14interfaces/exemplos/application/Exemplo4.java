package org.example.exercicio14interfaces.exemplos.application;

import org.example.exercicio14interfaces.exemplos.model.services.BrazilInterestService;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = scanner.nextDouble();
        System.out.print("Months: ");
        int months = scanner.nextInt();

        BrazilInterestService is = new BrazilInterestService(2.0);
        double payment = is.payment(amount, months);

        System.out.println("Payment after " + months + " months: ");
        System.out.println(String.format("%.2f", payment));
    }
}
