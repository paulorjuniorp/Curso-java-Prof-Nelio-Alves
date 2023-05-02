package org.example.exercicio9datahora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Formatacao {
    public static void main(String[] args) {
        LocalDate d01 = LocalDate.parse("2023-04-30");
        LocalDateTime d02 = LocalDateTime.parse("2023-04-30T10:59:50");
        Instant d03 = Instant.parse("2023-04-30T10:59:50Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        // Para utilizar o formater no instant
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        System.out.println("d01 = " + d01.format(fmt1));
        System.out.println("d01 = " + fmt1.format(d01));
        System.out.println("d01 = " + d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println();

        System.out.println("d02 = " + d02.format(fmt2));
        System.out.println("d02 = " + fmt2.format(d02));
        System.out.println("d02 = " + fmt1.format(d02));
        System.out.println("d02 = " + d02.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));

        System.out.println();

        // Instant não tem format, então se utiliza o datetimeformatter
        // Como o instant utiliza o time zone de londres, e estou passando o horário local no formatter
        // a hora exibida vai ser 3 horas a menos do que a passada no formatter
        System.out.println("d03 = " + fmt3.format(d03));
    }
}
