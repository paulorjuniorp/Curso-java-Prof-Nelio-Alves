package org.example.exercicio9datahora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class DataHoraGlobalLocal {
    public static void main(String[] args) {
        LocalDate d01 = LocalDate.parse("2023-05-01");
        LocalDateTime d02 = LocalDateTime.parse("2023-05-01T19:18:35");
        Instant d03 = Instant.parse("2023-05-01T19:19:17Z");

        // Data-hora global para local é tem que informar o timezone
//        for (String timeZone: ZoneId.getAvailableZoneIds()){
//            System.out.println(timeZone);
//        }
        LocalDate tz1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
        LocalDate tz2 = LocalDate.ofInstant(d03, ZoneId.of("Portugal"));
        LocalDateTime tz3 = LocalDateTime.ofInstant(d03,ZoneId.systemDefault());
        LocalDateTime tz4 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));

        System.out.println("tz1 = " + tz1);

        // Considerando que o Instant utiliza horário de Londres e como estamos no Brasil é exibido 3 horas a menos
        System.out.println("tz3 = " + tz3);
        // Portugal 1 hora a mais que Londres
        System.out.println("tz4 = " + tz4);

        System.out.println();

        // dia, mes e ano com LocalDate
        System.out.println("d01 dia = " + d01.getDayOfMonth());
        System.out.println("d01 mês = " + d01.getMonthValue());
        System.out.println("d01 ano = " + d01.getYear());

        System.out.println();

        // hora e minuto LocalDateTime
        System.out.println("d02 hora = " + d02.getHour());
        System.out.println("d02 minutos = " + d02.getMinute());
    }
}
