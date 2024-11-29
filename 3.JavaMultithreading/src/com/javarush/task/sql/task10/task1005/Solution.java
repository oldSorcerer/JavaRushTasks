package com.javarush.task.sql.task10.task1005;

import org.hibernate.Session;
import org.hibernate.query.Query;
import com.javarush.task.sql.task10.task1005.entities.Book;

import java.util.List;

/* 
task1005
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        List<Book> books;

        try (Session session = MySessionFactory.getSessionFactory().openSession()) {
            String hql = "from Book where Author.fullName = 'Mark Twain' and Publisher.name ='Фолио'";
            Query<Book> query = session.createQuery(hql, Book.class);
            books = query.list();
        }
        books.forEach(System.out::println);
    }
}