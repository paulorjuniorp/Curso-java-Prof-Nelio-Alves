package org.example.exercicio17jdbc.db;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DB {

    private static Properties loadProperties(){
        try(FileInputStream fileInputStream = new FileInputStream("db.properties")) {
            Properties props = new Properties();
            props.load(fileInputStream);
            return props;
        } catch (IOException e) {
            throw new DbException(e.getMessage());
        }
    }
}
