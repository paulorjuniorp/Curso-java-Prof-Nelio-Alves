package org.example.exercicio8lists.main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2,"Marco");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for (String s : result) {
            System.out.println(s);
        }

        System.out.println(list.size());

        list.remove("Anna");
        list.remove(1);

        list.removeIf(x -> x.charAt(0) == 'M');

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("Index of Bob: " + list.indexOf("Bob"));

        String nome = result.stream().filter(x->x.charAt(0) == 'A').findFirst().orElse(null);

        String nomeNull = result.stream().filter(x->x.charAt(0) == 'N').findFirst().orElse(null);

        System.out.println(nome);

        System.out.println(nomeNull);
    }
}
