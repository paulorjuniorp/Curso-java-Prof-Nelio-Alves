package org.example.exercicio15genericsetmap.exemplos.model.service;

import java.util.ArrayList;
import java.util.List;

public class PrintService {

    List<Integer> list = new ArrayList<>();
    public void addValue(int value){
        list.add(value);
    }
    public int first(){
        if (list.isEmpty()){
            throw new IllegalStateException("List is empty");
        }
        return list.get(0);
    }
    public void printValue(){
        for (Integer integer : list) System.out.println(integer);
    }
}
