package org.example.exercicio16programacaofuncional.exemplos.application;

import java.util.Arrays;
import java.util.List;

/**
 * Expressividade x código conciso
 * */
public class Exemplo5 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        // Expressividade
        Integer sumExpressividade = 0;
        for (Integer x : list){
            sumExpressividade += x;
        }

        //Código conciso
        Integer sum = list.stream().reduce(0, Integer::sum);
    }
}
