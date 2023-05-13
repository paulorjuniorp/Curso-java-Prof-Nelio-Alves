package org.example.exercicio10enum.enums;

import org.example.exercicio10enum.entities.ComentarioPublicacao;
import org.example.exercicio10enum.entities.Publicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Exercicio2 {
    public static void main(String[] args) throws ParseException {
        Publicacao publicacao1 = new Publicacao();
        SimpleDateFormat formatoData1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        publicacao1.setMomento(formatoData1.parse("21/06/2018 13:05:44"));
        publicacao1.setTitulo("Viajando para Nova Zelândia");
        publicacao1.setLikes(12);
        publicacao1.setConteudo("Estou indo visitar esse país maravilhoso!");

        ComentarioPublicacao primeiroComentarioPublicacao1 = new ComentarioPublicacao("Tenha uma ótima viagem");
        ComentarioPublicacao segundoComentarioPublicacao1 = new ComentarioPublicacao("UAU que incrívrel!");

        publicacao1.addComentario(primeiroComentarioPublicacao1);
        publicacao1.addComentario(segundoComentarioPublicacao1);

        Publicacao publicacao2 = new Publicacao();
        SimpleDateFormat formatoData2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        publicacao2.setMomento(formatoData2.parse("28/07/2018 23:14:19"));
        publicacao2.setTitulo("Boa noite rapaziada");
        publicacao2.setLikes(5);
        publicacao2.setConteudo("Vejo vocês amanhã");

        ComentarioPublicacao primeiroComentarioPublicacao2 = new ComentarioPublicacao("Boa noite");
        ComentarioPublicacao segundoComentarioPublicacao2 = new ComentarioPublicacao("Que a força esteja com você");

        publicacao2.addComentario(primeiroComentarioPublicacao2);
        publicacao2.addComentario(segundoComentarioPublicacao2);

        System.out.println(publicacao1.getTitulo());
        System.out.printf("%d Likes - %s%n", publicacao1.getLikes(), publicacao1.getMomento());
        System.out.println(publicacao1.getConteudo());
        System.out.println("Comentários: ");
        for (ComentarioPublicacao comentario : publicacao1.getComentarios()) {
            System.out.println(comentario);
        }

        System.out.println("\n");

        System.out.println(publicacao2.getTitulo());
        System.out.printf("%d Likes - %s%n", publicacao2.getLikes(), publicacao2.getMomento());
        System.out.println(publicacao2.getConteudo());
        System.out.println("Comentários: ");
        for (ComentarioPublicacao comentario : publicacao2.getComentarios()) {
            System.out.println(comentario);
        }

    }
}
