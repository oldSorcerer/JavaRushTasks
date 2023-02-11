package com.javarush.task.sql.task08.task0805;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Set;

/* 
task0805
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Set<Employee> employees = Set.of(
                new Employee("Vasya", 33, "lead"),
                new Employee("Pasha", 40, "dev"),
                new Employee("Sasha", 40, "lead"),
                new Employee("Dima", 40, "director"),
                new Employee("Sasha", 40, "dev"));
        String sql = "insert into employee (name, age, smth) values (?, ?, ?)";

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
             PreparedStatement statement = connection.prepareStatement(sql)) {
            for (Employee employee : employees) {
                statement.setString(1, employee.getName());
                statement.setInt(2, employee.getAge());
                statement.setString(3, employee.getSmth());
                statement.addBatch();
            }
            statement.executeBatch();
        }
    }
}
/*
drop table employee;

CREATE TABLE employee
(
    id   INT PRIMARY KEY NOT NULL
    AUTO_INCREMENT,
    name VARCHAR(100) NULL,
    age  INT          NULL,
    smth VARCHAR(100) NULL
);
*/