package org.example.exercicio10enum.entities;

public class ComentarioPublicacao {
    private String texto;

    public ComentarioPublicacao() {
    }

    public ComentarioPublicacao(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
