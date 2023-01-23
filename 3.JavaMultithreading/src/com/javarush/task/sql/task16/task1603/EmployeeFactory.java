package com.javarush.task.sql.task16.task1603;

/* 
Удаление через Criteria API
*/

import org.hibernate.Session;
import java.util.List;

public class EmployeeFactory {

    public static void initEmployees() {
        final List<Employee> employeeList = List.of(new Employee(1,"Bob","Smith"),new Employee(2,"Mary","Johnson"),new Employee(3,"Steve","Jones"),new Employee(4,"Hannah","Montana"));

        try (Session session = MySessionFactory.getSessionFactory().openSession()) {
            for (Employee employee : employeeList) {
                session.beginTransaction();
                session.save(employee);
                session.getTransaction().commit();
            }
        }
    }
}
