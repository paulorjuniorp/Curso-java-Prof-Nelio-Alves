package org.example.exercicio9datahora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculoDataHora {
    public static void main(String[] args) {
        LocalDate d01 = LocalDate.parse("2023-05-01");
        LocalDateTime d02 = LocalDateTime.parse("2023-05-01T19:18:35");
        Instant d03 = Instant.parse("2023-05-01T19:19:17Z");

        // Subtração de dias
        LocalDate semanaPassadaLocalDate = d01.minusDays(7);
        LocalDate proximaSemanaLocalDate = d01.plusDays(7);


        System.out.println("Semana passada = " + semanaPassadaLocalDate);
        System.out.println("Próxima semana = " + proximaSemanaLocalDate);

        System.out.println();

        LocalDateTime semanaPassadaLocalDateTime = d02.minusDays(7);
        LocalDateTime proximaSemanaLocalDateTime = d02.plusDays(7);

        System.out.println("Semana passada = " + semanaPassadaLocalDateTime);
        System.out.println("Próxima semana = " + proximaSemanaLocalDateTime);

        System.out.println();

        // O Instant não tem subtração de dia, mes ou ano
        // Para fazer esse tipo de operação utiliza-se o minus e o chonounit
        Instant semanaPassadaInstant = d03.minus(7, ChronoUnit.DAYS);
        Instant proximaSemanaInstant = d03.plus(7, ChronoUnit.DAYS);

        System.out.println("Semana passada = " + semanaPassadaInstant);
        System.out.println("Próxima semana = " + proximaSemanaInstant);

        // Duração entre duas datas
        // Para utilizar o duration com LocalDate é necessário converter para "LocalDateTime"
        Duration t1 = Duration.between(semanaPassadaLocalDate.atTime(0, 0) , proximaSemanaLocalDate.atTime(0, 0));
        Duration t2 = Duration.between(semanaPassadaLocalDateTime, d02);
        Duration t3 = Duration.between(d03,semanaPassadaInstant);

        System.out.println();

        System.out.println("t1 dias = " + t1.toDays());
        System.out.println("t2 dias = " + t2.toDays());
        System.out.println("t3 dias = " + t3.toDays());
    }
}
