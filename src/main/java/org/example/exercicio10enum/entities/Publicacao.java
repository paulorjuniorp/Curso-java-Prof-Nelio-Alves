package org.example.exercicio10enum.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Publicacao {
    private Date momento;
    private String titulo;
    private String conteudo;
    private Integer likes;
    List<ComentarioPublicacao> comentarios = new ArrayList<>();

    public Publicacao() {
    }

    public Publicacao(Date momento, String titulo, String conteudo, Integer likes) {
        this.momento = momento;
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.likes = likes;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<ComentarioPublicacao> getComentarios() {
        return comentarios;
    }

    public void addComentario(ComentarioPublicacao comentarioPublicacao){
        comentarios.add(comentarioPublicacao);
    }

    public void removeComentario(ComentarioPublicacao comentarioPublicacao){
        comentarios.remove(comentarioPublicacao);
    }
}
