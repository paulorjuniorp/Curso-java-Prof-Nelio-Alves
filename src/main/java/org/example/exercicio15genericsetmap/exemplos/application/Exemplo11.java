package org.example.exercicio15genericsetmap.exemplos.application;

import java.util.Map;
import java.util.TreeMap;

// Exemplo com Map
public class Exemplo11 {
    public static void main(String[] args) {
        Map<String, String> cookies = new TreeMap<>();
        cookies.put("username", "Maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "9971122");

        cookies.remove("email");

        System.out.println("ALL COOKIES:");
        for (String key : cookies.keySet()) {
            System.out.println(key);
        }

    }
}
