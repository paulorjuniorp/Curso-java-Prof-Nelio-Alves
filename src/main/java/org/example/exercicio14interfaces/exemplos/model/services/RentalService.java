package org.example.exercicio14interfaces.exemplos.model.services;

import org.example.exercicio14interfaces.exemplos.model.entidades.AluguelCarro;
import org.example.exercicio14interfaces.exemplos.model.entidades.Fatura;

import java.time.Duration;

public class RentalService {
    private Double pricePerHour;
    private Double pricePerDay;
    private BrazilTaxService taxService;

    public RentalService(Double pricePerHour, Double pricePerDay, BrazilTaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    public void processInvoice(AluguelCarro aluguelCarro){
        Duration duration = Duration.between(aluguelCarro.getInicio(), aluguelCarro.getFim());
        double minutes = duration.toMinutes();
        double hours = minutes / 60;

        double basicPayment;
        if (hours > 12){
            basicPayment = pricePerDay * Math.ceil(hours / 24.0);
        } else {
            basicPayment = pricePerHour * Math.ceil(hours);
        }

        double tax = taxService.tax(basicPayment);

        aluguelCarro.setFatura(new Fatura(basicPayment, tax));
    }

}
