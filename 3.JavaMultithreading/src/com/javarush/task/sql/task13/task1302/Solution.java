package com.javarush.task.sql.task13.task1302;

import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

/* 
Расстановка аннотаций 2
*/

public class Solution {

    public static void main(String[] args) {
        try (Session session = MySessionFactory.getSessionFactory().openSession()) {
            Query<Author> query = session.createQuery("from Author", Author.class);
            List<Author> authors = query.list();

            authors.forEach(author -> {
                List<String> achievements = author.getAchievements();
                if (achievements.size() > 0) {
                    System.out.println(author.getFullName() + ":");
                    achievements.forEach(System.out::println);
                }
            });
        }
    }
}
