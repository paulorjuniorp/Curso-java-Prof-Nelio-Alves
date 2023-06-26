package org.example.exercicio14interfaces.exemplos.model.services;

public class UsaInterestService implements InterestService {
    private Double interestRate;

    public UsaInterestService(Double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }
}
