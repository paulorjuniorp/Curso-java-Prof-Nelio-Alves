package org.example.exercicio16programacaofuncional.exemplos.application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Exemplo com stream
 * */
public class Exemplo20 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,4,5,6,7,9,10);

        Stream<Integer> inteiros = list.stream().map(x -> x * 10);

        System.out.println(Arrays.toString(inteiros.toArray()));
    }
}
