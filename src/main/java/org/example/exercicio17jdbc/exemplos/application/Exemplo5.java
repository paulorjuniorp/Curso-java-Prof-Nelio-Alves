package org.example.exercicio17jdbc.exemplos.application;

import org.example.exercicio17jdbc.db.DB;
import org.example.exercicio17jdbc.db.DbException;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

// transaction
public class Exemplo5 {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;

        try{
            connection.setAutoCommit(false);
            connection = DB.getConnection();
            statement = connection.createStatement();

            int linha1 = statement.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1");

            int x = 1;
            if (x < 2){
                throw new SQLException("Fake error");
            }

            int linha2 = statement.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2");

            System.out.println("Linha 1: " + linha1 + ". Linha 2: " + linha2);
            connection.commit();
        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
                throw new DbException(ex.getMessage());
            }
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(statement);
            DB.closeConnection();
        }


    }
}
