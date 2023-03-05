package com.javarush.task.sql.task11.task1103;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/* 
task1103
*/

public class Solution {
    public static Animal animalGet;
    public static Animal animalLoad;
    public static Animal animalFind;

    public static void main(String[] args) throws Exception {
        Animal animalCat = new Animal();
        animalCat.setName("Murka");
        animalCat.setAge(5);
        animalCat.setFamily("Cats");

        try (SessionFactory sessionFactory = MySessionFactory.getSessionFactory();
             Session session = sessionFactory.openSession();) {
            Transaction transaction = session.beginTransaction();
            long id = (long) session.save(animalCat);
            animalGet = session.get(Animal.class, id + 1);
            animalLoad = session.load(Animal.class, id + 1);
            animalFind = session.find(Animal.class, id + 1);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(animalGet == null);
        System.out.println(animalLoad != null);
        System.out.println(animalFind == null);
    }
}