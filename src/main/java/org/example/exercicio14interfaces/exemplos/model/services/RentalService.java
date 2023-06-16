package org.example.exercicio14interfaces.exemplos.model.services;

import org.example.exercicio14interfaces.exemplos.model.entidades.AluguelCarro;
import org.example.exercicio14interfaces.exemplos.model.entidades.Fatura;

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
        //aluguelCarro.setFatura(new Fatura());
    }

}
