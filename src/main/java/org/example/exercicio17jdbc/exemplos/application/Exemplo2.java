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
                    +"(?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);

            statement.setString(1,"Tantan Brown");
            statement.setString(2,"tbrown@email.com");
            statement.setDate(3,new Date(formatoData.parse("17/11/1957").getTime()));
            statement.setDouble(4, 6700.0);
            statement.setInt(5, 2);

            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0){
                ResultSet resultSet = statement.getGeneratedKeys();
                while (resultSet.next()){
                    int id = resultSet.getInt(1);
                    System.out.println("Done! Id = " + id);
                }
            } else {
                System.out.println("No rows affected!!");
            }
            System.out.println(rowsAffected);
        } catch (SQLException | ParseException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(statement);
            DB.closeConnection();
        }
    }
}
