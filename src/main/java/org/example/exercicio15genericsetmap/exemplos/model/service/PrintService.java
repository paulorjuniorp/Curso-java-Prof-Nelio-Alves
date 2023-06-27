package org.example.exercicio15genericsetmap.exemplos.model.service;

import java.util.ArrayList;
import java.util.List;

public class PrintService {

    List<Object> list = new ArrayList<>();
    public void addValue(Object value){
        list.add(value);
    }
    public Object first(){
        if (list.isEmpty()){
            throw new IllegalStateException("List is empty");
        }
        return list.get(0);
    }
    public void printValue(){
        if (list.isEmpty()){
            throw new IllegalStateException("List is empty");
        }
        for (Object integer : list) System.out.println(integer);
    }
}
