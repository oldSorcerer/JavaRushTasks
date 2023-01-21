package com.javarush.task.sql.task13.task1307;

import com.javarush.task.sql.task13.task1307.entities.Address;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

/* 
OneToOne
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        try (Session session = MySessionFactory.getSessionFactory().openSession()) {
            Query<Address> query = session.createQuery("from Address", Address.class);
            List<Address> addresses = query.getResultList();

            for (Address address : addresses) {
                System.out.println(address.getUser().getFullName());
            }
        }
    }
}
