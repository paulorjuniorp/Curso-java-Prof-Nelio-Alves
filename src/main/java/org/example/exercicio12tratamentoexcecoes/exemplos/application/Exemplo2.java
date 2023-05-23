package org.example.exercicio12tratamentoexcecoes.exemplos.application;

import org.example.exercicio12tratamentoexcecoes.exemplos.model.entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//resolução ruim
public class Exemplo2 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Room number: ");
        int number = scanner.nextInt();
        System.out.print("Check-in date (dd/MM/yyyy) ");
        Date checkIn = formatoData.parse(scanner.next());
        System.out.print("Check-out date (dd/MM/yyyy) ");
        Date checkOut = formatoData.parse(scanner.next());
        // essa validação deveria ser feita no construtor
        if (!checkOut.after(checkIn)){
            System.out.println("Error in reservation: Check-out date must be after check-in date");
        } else {
            Reservation reservation = new Reservation(number,checkIn,checkOut);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.println("Enter data to update the reservation:");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = formatoData.parse(scanner.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOut = formatoData.parse(scanner.next());


            String error = reservation.updateDates(checkIn, checkOut);
            if (error != null){
                System.out.println(error);
            } else {
                System.out.println("Reservation: " + reservation);
            }
        }

        scanner.close();
    }
}
