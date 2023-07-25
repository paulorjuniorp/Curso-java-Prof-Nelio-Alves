package org.example.exercicio17jdbc.exemplos.application;

import org.example.exercicio17jdbc.db.DB;

import java.sql.Connection;

public class Exemplo1 {
    public static void main(String[] args) {
        Connection connection = DB.getConnection();
        DB.closeConnection();
    }
}
