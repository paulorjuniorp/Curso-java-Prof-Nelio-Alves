package org.example.exercicio15genericsetmap.exemplos.application;

import org.example.exercicio15genericsetmap.exemplos.model.service.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Uma empresa de consultoria deseja avaliar a performance de produtos, funcionários, dentre outras coisas.
 * Um dos cálculos que ela precisa é encontrar o maior dentre um conjunto de elementos. Fazer um programa
 * que leia um conjunto de produtos a partir de um arquivo, conforme exemplo, e depois mostre o mais caro
 * deles.
 *
 * */
public class Exemplo2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        String path = "C:\\temp\\in.txt";

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line = bufferedReader.readLine();
            while (line != null){
                list.add(Integer.parseInt(line));
                line = bufferedReader.readLine();
            }

            Integer x = CalculationService.max(list);
            System.out.println("Max: ");
            System.out.println(x);
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
