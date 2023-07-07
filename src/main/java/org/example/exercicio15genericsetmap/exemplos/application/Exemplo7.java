package org.example.exercicio15genericsetmap.exemplos.application;

import java.util.HashSet;
import java.util.Set;

/**
 * Set exemplo
 * HashSet mais rápido porém não ordenado
 * TreeSet mais lento e ordenado pelo compareTo
 * LinkedHashSet mais lento que o hash, mas mantém a posição
 *
 * métodos: add, remove e contains baseados em hashcode se não existir é utilizado os ponteiros
 * clear()
 * size()
 * removeIf()
 * */
public class Exemplo7 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("TV");
        set.add("Notebook");
        set.add("Tablet");

        System.out.println(set.contains("Notebook"));

        for (String s : set) {
            System.out.println(s);
        }

    }
}
