package org.example.exercicio12tratamentoexcecoes.exemplos.model.exception;

public class DomainExeption extends Exception{
    private static final long serialVersionUID = 1L;
    public DomainExeption(String msg) {
        super(msg);
    }
}
