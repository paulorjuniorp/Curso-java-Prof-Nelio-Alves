package org.example.exercicio15genericsetmap.exemplos.application;

import org.example.exercicio15genericsetmap.exemplos.model.entities.Produce;

import java.util.HashSet;
import java.util.Set;

public class Exemplo9 {
    public static void main(String[] args) {
        Set<Produce> set = new HashSet<>();
        set.add(new Produce("TV",900.0));
        set.add(new Produce("Notebook", 1200.0));
        set.add(new Produce("Tablet",400.0));

        Produce prod = new Produce("Notebook",1200.0);

        System.out.println(set.contains(prod));
    }
}
