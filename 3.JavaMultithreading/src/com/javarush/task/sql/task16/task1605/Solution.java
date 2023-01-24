package com.javarush.task.sql.task16.task1605;

import org.hibernate.Session;
import org.hibernate.Transaction;

/* 
Транзакции
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        switchToRemote();
    }

    public static void switchToRemote() {
        try (Session session = MySessionFactory.getSessionFactory().openSession()) {
            //напишите тут ваш код

        }
    }
}