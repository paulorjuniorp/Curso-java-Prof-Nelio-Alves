package org.example.exercicio12tratamentoexcecoes.exemplos.application;

import org.example.exercicio12tratamentoexcecoes.exemplos.model.entities.Reservation;
import org.example.exercicio12tratamentoexcecoes.exemplos.model.exception.DomainExeption;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

// Exemplo tratando as exceções de maneira correta
public class Exemplo3 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.print("Room number: ");
            int number = scanner.nextInt();
            System.out.print("Check-in date (dd/MM/yyyy) ");
            Date checkIn = formatoData.parse(scanner.next());
            System.out.print("Check-out date (dd/MM/yyyy) ");
            Date checkOut = formatoData.parse(scanner.next());

            Reservation reservation = new Reservation(number,checkIn,checkOut);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.println("Enter data to update the reservation:");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = formatoData.parse(scanner.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOut = formatoData.parse(scanner.next());


            reservation.updateDates(checkIn, checkOut);
            System.out.println("Reservation: " + reservation);
        } catch (ParseException e){
            System.out.println("Formato inválido");
        } catch (DomainExeption e) {
            throw new RuntimeException(e.getMessage());
        }

        scanner.close();
    }
}
