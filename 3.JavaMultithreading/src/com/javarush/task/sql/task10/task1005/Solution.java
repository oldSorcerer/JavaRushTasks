package com.javarush.task.sql.task10.task1005;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import com.javarush.task.sql.task10.task1005.entities.Book;

import java.util.List;

/* 
task1005
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        List<Book> books;

        try (SessionFactory sessionFactory = MySessionFactory.getSessionFactory();
             Session session = sessionFactory.openSession()) {
            Query<Book> query = session.createQuery("from Book b where author.fullName = 'Mark Twain' and publisher.name ='Фолио'", Book.class);
            books = query.list();
        }
        books.forEach(System.out::println);
    }
}