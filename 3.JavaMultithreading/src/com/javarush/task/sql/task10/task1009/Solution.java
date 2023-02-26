package com.javarush.task.sql.task10.task1009;

import org.hibernate.Session;
import org.hibernate.query.Query;

/* 
task1009
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println("Salary fund: $" + getSalaryFund());
        System.out.println("Agerage age: " + getAverageAge());
    }

    public static Long getSalaryFund() {
        try (Session session = MySessionFactory.getSessionFactory().openSession()) {
            String hql = "select sum(salary) from Employee";
            Query<Long> query = session.createQuery(hql, Long.class);
            return query.uniqueResult();
        }
    }

    public static Double getAverageAge() {
        try (Session session = MySessionFactory.getSessionFactory().openSession()) {
            String hql = "select avg(age) from Employee";
            Query<Double> query = session.createQuery(hql, Double.class);
            return query.uniqueResult();
        }
    }
}