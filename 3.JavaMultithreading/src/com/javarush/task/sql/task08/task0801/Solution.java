package com.javarush.task.sql.task08.task0801;

import java.sql.*;

/* 
Работа с транзакциями
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        try(Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test", "root", "root");
            Statement statement = connection.createStatement()){
            connection.setAutoCommit(false);
            statement.executeUpdate("UPDATE employee SET salary = salary + 2000 WHERE name = 'Diego'");
            statement.executeUpdate("UPDATE employee SET salary = salary + 500 WHERE name = 'Amigo'");
            connection.commit();
        }

    }
}
