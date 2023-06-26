package org.example.exercicio14interfaces.exemplos.model.services;

import java.security.InvalidParameterException;

public interface InterestService {
    double getInterestRate();
    default double payment(double amounth, int months){
        if (months < 1){
            throw new InvalidParameterException("Months must be greater than zero.");
        }

        return amounth * Math.pow(1.0 + getInterestRate() / 100.0, months);
    }
}
