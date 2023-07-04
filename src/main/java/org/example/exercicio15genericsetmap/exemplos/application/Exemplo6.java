package org.example.exercicio15genericsetmap.exemplos.application;

import org.example.exercicio15genericsetmap.exemplos.model.entities.Client;

/**
 *
 * Equals and hashcode
 * */
public class Exemplo6 {
    public static void main(String[] args) {
        Client client1 = new Client("Maria", "maria@gmail.com");
        Client client2 = new Client("Bob", "bob@gmail.com");
        Client client3 = new Client("Maria", "maria@gmail.com");
        Client client4 = new Client("Maria", "mariasegundo@gmail.com");


        System.out.println(client1.hashCode());
        System.out.println(client2.hashCode());
        System.out.println(client3.hashCode());
        System.out.println(client4.hashCode());

        System.out.println();

        System.out.println(client1.equals(client2));
        System.out.println(client1.equals(client3));
        System.out.println(client1.equals(client4));

        System.out.println();

        System.out.println(client1 == client2);
        System.out.println(client1 == client3);
        System.out.println(client1 == client4);

    }
}
