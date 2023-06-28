package com.javarush.task.sql.task13.task1304;

import com.javarush.task.sql.task13.task1304.entities.Author;
import org.hibernate.Session;
import org.hibernate.query.Query;

/* 
Автор книги или книга автора?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        try (Session session = MySessionFactory.getSessionFactory().openSession()) {
            Query<Author> query = session.createQuery("from Author where ", Author.class);

        }
    }
}
