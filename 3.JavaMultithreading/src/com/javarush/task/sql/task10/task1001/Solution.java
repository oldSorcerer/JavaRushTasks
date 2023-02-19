package com.javarush.task.sql.task10.task1001;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

/* 
task1001
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        try(SessionFactory sessionFactory = MySessionFactory.getSessionFactory();
            Session session = sessionFactory.openSession()) {
            String hql = "select distinct smth from Employee where age > 18";
            Query<String> query = session.createQuery(hql, String.class);
            query.list().forEach(System.out::println);
        }
    }
}