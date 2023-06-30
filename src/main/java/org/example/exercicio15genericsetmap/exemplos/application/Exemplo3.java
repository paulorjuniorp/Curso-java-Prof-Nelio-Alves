package org.example.exercicio15genericsetmap.exemplos.application;

import java.util.Arrays;
import java.util.List;

/**
 * Tipos coringa
 * */
public class Exemplo3 {
    public static void main(String[] args) {
        List<Integer> listInts = Arrays.asList(3,4,7,8);
        printList(listInts);

        List<String> listStr = Arrays.asList("João", "Pedro", "Felipe");
        printList(listStr);
    }

    public static void printList(List<?> list){
        for (Object obj : list) {
            System.out.println(obj);
        }

    }
}
