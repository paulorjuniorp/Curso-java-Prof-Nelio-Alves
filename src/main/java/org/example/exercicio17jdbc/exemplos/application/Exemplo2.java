package org.example.exercicio17jdbc.exemplos.application;

import org.example.exercicio17jdbc.db.DB;
import org.example.exercicio17jdbc.db.DbException;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Exemplo2 {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement statement = null;
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
        try {
            connection = DB.getConnection();
            statement = connection.prepareStatement(
                "INSERT INTO seller "
                    +"(Name, Email, BirthDate, BaseSalary, DepartmentId) "
                    +"VALUES "
                    +"(?,?,?,?,?)");

            statement.setString(1,"Joe Mango");
            statement.setString(2,"joaodamanga@email.com");
            statement.setDate(3,new Date(formatoData.parse("23/07/1965").getTime()));
            statement.setDouble(4, 3000.0);
            statement.setInt(5, 4);

            int rowsAffected = statement.executeUpdate();
            System.out.println(rowsAffected);
        } catch (SQLException | ParseException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(statement);
            DB.closeConnection();
        }
    }
}
