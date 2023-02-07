package com.javarush.task.sql.task08.task0802;

import java.sql.*;

/* 
Откат транзакции
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test", "root", "root");
        connection.setAutoCommit(false);
        try (Statement statement = connection.createStatement();) {
            statement.executeUpdate("UPDATE employee SET salary = salary + 2000 WHERE name = 'Diego'");
            statement.executeUpdate("UPDATE employee SET salary = salary + 500 WHERE name = 'Amigo'");
            connection.commit();
        } catch (Exception e) {
            if (connection != null) connection.rollback();
        } finally {
            if (connection != null) connection.close();
        }
    }
}
