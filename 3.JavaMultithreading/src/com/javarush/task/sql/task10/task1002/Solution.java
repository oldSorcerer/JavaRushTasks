package com.javarush.task.sql.task10.task1002;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

/* 
task1002
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(getDirector());
    }

    public static Employee getDirector() {
        try(SessionFactory sessionFactory = MySessionFactory.getSessionFactory();
            Session session = sessionFactory.openSession()) {
            String hql = "from Employee where smth = 'director'";
            Query<Employee> query = session.createQuery(hql, Employee.class);
            return query.uniqueResult();
        }
    }
}