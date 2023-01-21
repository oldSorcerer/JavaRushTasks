package com.javarush.task.sql.task13.task1301;

import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;
import java.util.Set;

/* 
Расстановка аннотаций
*/

public class Solution {

    public static void main(String[] args) {
        try (Session session = MySessionFactory.getSessionFactory().openSession()) {
            Query<Author> query = session.createQuery("from Author", Author.class);
            List<Author> authors = query.list();

            authors.forEach(author -> {
                Set<String> articles = author.getArticles();
                if (articles.size() > 0) {
                    System.out.println(author.getFullName() + ":");
                    articles.forEach(System.out::println);
                }
            });
        }
    }
}