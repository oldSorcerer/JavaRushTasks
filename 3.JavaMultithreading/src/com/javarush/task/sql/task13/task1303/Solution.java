package com.javarush.task.sql.task13.task1303;

import org.hibernate.Session;
import org.hibernate.query.Query;
import com.javarush.task.sql.task13.task1303.entities.Publisher;

import java.util.List;

/* 
Опять книги
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        List<Publisher> publishers;

        try (Session session = MySessionFactory.getSessionFactory().openSession()) {
            Query<Publisher> query = session.createQuery("select distinct b.publisher from Book b where b.author.fullName = :AUTHOR_FULLNAME", Publisher.class);
            query.setParameter("AUTHOR_FULLNAME", "Mark Twain");
            publishers = query.list();
        }
        publishers.stream().map(Publisher::getName).forEach(System.out::println);
    }
}
