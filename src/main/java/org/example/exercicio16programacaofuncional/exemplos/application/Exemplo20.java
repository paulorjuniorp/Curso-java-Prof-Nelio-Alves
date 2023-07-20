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

        Stream<String> stringStream = Stream.of("Maria","Alex","Bob");

        System.out.println(Arrays.toString(stringStream.toArray()));

        Stream<Integer> integerStream = Stream.iterate(0, x -> x + 2).limit(20);

        System.out.println(Arrays.toString(integerStream.toArray()));

        Stream<Long> fibonacci = Stream.iterate(new Long[]{0L,1L}, p -> new Long[]{p[1], p[0] + p[1]}).map(p -> p[0]);

        System.out.println(Arrays.toString(fibonacci.limit(10).toArray()));
    }
}
