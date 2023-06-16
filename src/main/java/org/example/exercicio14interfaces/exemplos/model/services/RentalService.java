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
        long hours = duration.toHours();
        if (hours > 12){

        } else {

        }
        //aluguelCarro.setFatura(new Fatura());
    }

}
