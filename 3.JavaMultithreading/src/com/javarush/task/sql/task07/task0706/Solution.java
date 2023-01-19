package com.javarush.task.sql.task07.task0706;

import java.sql.*;

/* 
task0706
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        try (Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test", "root", "root");
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery("SELECT * FROM employee limit 1");

            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                int age = resultSet.getInt(3);
                String smth = resultSet.getString(4);
                System.out.printf("id = %d\t\t name = %s\t\t age = %d\t\t smth = %s" + System.lineSeparator(), id, name, age, smth);
            }
        }
    }
}
/*
* CREATE TABLE employee
(
    id   INT,
    name VARCHAR(100) NULL,
    age INT NULL,
    smth VARCHAR(100) NULL,
    PRIMARY KEY (id)
);*/