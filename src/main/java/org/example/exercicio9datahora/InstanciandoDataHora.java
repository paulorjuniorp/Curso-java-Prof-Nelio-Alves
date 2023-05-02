package org.example.exercicio9datahora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class InstanciandoDataHora {

    public static void main(String[] args) {
        // Instanciando a partir do agora
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        System.out.println("d01 = " + d01);
        System.out.println("d02 = " + d02);
        System.out.println("d03 = " + d03);

        // ISO 8601
        LocalDate d04 = LocalDate.parse("2023-04-30");
        LocalDateTime d05 = LocalDateTime.parse("2023-04-30T10:37:50");
        Instant d06 = Instant.parse("2023-04-30T10:40:32Z");
        // time zone global
        Instant d07 = Instant.parse("2023-04-30T10:40:32-03:00");

        DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd $ MM $ yy");
        System.out.println(d01.format(fmt01));

        DateTimeFormatter fmt02 = DateTimeFormatter.ofPattern("HH:mm dd[a]MM[a]yy");
        System.out.println(d02.format(fmt02));

        System.out.println("d04 = " + d04);
        System.out.println("d05 = " + d05);
        System.out.println("d06 = " + d06);
        System.out.println("d07 = " + d07);

    }
}
