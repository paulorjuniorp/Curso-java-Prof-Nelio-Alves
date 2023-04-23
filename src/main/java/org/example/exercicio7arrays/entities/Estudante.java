package org.example.exercicio7arrays.entities;

public class Estudante {
    private String nome;
    private String email;
    private int quarto;

    public Estudante(String nome, String email, int quarto) {
        this.nome = nome;
        this.email = email;
        this.quarto = quarto;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getQuarto() {
        return quarto;
    }
}
