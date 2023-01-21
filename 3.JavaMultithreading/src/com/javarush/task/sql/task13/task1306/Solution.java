package com.javarush.task.sql.task13.task1306;

import com.javarush.task.sql.task13.task1306.entities.Author;
import org.hibernate.Session;
import org.hibernate.query.Query;

/* 
Соавторство
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        try (Session session = MySessionFactory.getSessionFactory().openSession()) {
            Query<Author> query = session.createQuery("from Author where fullName = :AUTHOR_FULLNAME", Author.class);
            query.setParameter("AUTHOR_FULLNAME", "Mark Twain");
            Author authorMarkTwain = query.getSingleResult();

            authorMarkTwain.getBooks()
                    .stream()
                    .flatMap(book -> book.getAuthors().stream())
                    .filter(author -> !authorMarkTwain.equals(author))
                    .distinct()
                    .map(Author::getFullName)
                    .forEach(System.out::println);
        }
    }
}
