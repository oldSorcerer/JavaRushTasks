package com.javarush.task.sql.task07.task0702;

import java.sql.*;

/* 
task0702
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        try (Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test", "root", "root");
             Statement statement = connection.createStatement();) {
            statement.executeQuery("SELECT 7 * 8");
        }

    }
}
