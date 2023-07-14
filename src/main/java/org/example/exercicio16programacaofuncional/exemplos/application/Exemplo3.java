package org.example.exercicio16programacaofuncional.exemplos.application;

import java.util.Arrays;

/**
 * Exemplo de Transparência Referencial
 *
 * */
public class Exemplo3 {

    // exemplo que não é referencialmente transparente
    public static int globalValue = 3;

    public static void main(String[] args) {

        int[] vect = new int[]{3, 4, 5};
        changeOddValues(vect);
        System.out.println(Arrays.toString(vect));
    }

    public static void changeOddValues(int[] numbers){
        for (int i=0; i < numbers.length; i++){
            if (numbers[i] % 2 != 0){
                numbers[i] += globalValue;
            }
        }
    }
}
