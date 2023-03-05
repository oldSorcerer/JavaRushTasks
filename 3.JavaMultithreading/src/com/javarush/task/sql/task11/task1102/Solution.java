package com.javarush.task.sql.task11.task1102;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/* 
task1102
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Animal animalCat = new Animal();
        animalCat.setName("Murka");
        animalCat.setAge(5);
        animalCat.setFamily("Cats");

        Animal animalDog = new Animal();
        animalDog.setName("Barsik");
        animalDog.setAge(3);
        animalDog.setFamily("Dogs");

        try(SessionFactory sessionFactory = MySessionFactory.getSessionFactory();
            Session session = sessionFactory.openSession();) {
            Transaction transaction = session.beginTransaction();
            session.save(animalCat);
            session.saveOrUpdate(animalCat);
            session.saveOrUpdate(animalDog);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}