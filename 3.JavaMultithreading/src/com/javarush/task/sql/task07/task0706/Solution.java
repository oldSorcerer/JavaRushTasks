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

            ResultSetMetaData metaData = resultSet.getMetaData();

            for (int i = 1; i <= metaData.getColumnCount(); i++) {

                String columnName = metaData.getColumnName(i);
                String columnTypeName = metaData.getColumnTypeName(i);

                System.out.println(columnName + "(" + columnTypeName + ")");
            }
        }
    }
}
/*
CREATE TABLE employee
(
    id   INT,
    name VARCHAR(100) NULL,
    age INT NULL,
    smth VARCHAR(100) NULL,
    PRIMARY KEY (id)
);
*/