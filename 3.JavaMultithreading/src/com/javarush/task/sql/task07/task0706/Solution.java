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
            ResultSet resultSet = statement.executeQuery("SELECT * FROM employe limit 1");

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                String smth = resultSet.getString("smth");
                System.out.printf("%d %s %d %s" + System.lineSeparator(), id, name, age, smth);
            }


        }

    }
}
