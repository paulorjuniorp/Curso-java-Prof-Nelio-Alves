package org.example.exercicio17jdbc.exemplos.application;

import org.example.exercicio17jdbc.db.DB;
import org.example.exercicio17jdbc.db.DbException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// update
public class Exemplo3 {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DB.getConnection();
            preparedStatement = connection.prepareStatement(
                    "Update seller "
                    + "SET BaseSalary = BaseSalary + ? "
                    + "WHERE (DepartmentId = ?)"
            );

            preparedStatement.setDouble(1, 200.0);
            preparedStatement.setInt(2,1);

            int rowsAffected = preparedStatement.executeUpdate();

            System.out.println("Done! Rows affected: " + rowsAffected);
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
    }
}
