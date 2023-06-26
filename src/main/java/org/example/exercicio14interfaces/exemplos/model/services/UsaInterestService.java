package org.example.exercicio14interfaces.exemplos.model.services;

public class UsaInterestService {
    private Double interestRate;

    public UsaInterestService(Double interestRate) {
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }
}
