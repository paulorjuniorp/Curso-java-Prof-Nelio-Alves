package org.example.exercicio15genericsetmap.exemplos.application;

import org.example.exercicio15genericsetmap.exemplos.model.entities.Produce;

import java.util.HashMap;
import java.util.Map;

public class Exemplo12 {
    public static void main(String[] args) {
        Map<Produce, Double> cookies = new HashMap<>();

        Produce produce1 = new Produce("Tv", 900.0);
        Produce produce2 = new Produce("Notebook", 1200.0);
        Produce produce3 = new Produce("Tablet", 400.0);

        cookies.put(produce1, 10000.0);
        cookies.put(produce2, 20000.0);
        cookies.put(produce3, 15000.0);

        Produce ps = new Produce("Tv", 900.0);

        System.out.println("Contais 'ps' key: " + cookies.containsKey(ps));
    }
}
