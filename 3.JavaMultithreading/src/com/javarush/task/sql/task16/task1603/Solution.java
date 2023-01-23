package com.javarush.task.sql.task16.task1603;

/* 
Удаление через Criteria API
*/

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaDelete;
import jakarta.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Solution {

    public static void main(String[] args) {
        EmployeeFactory.initEmployees();
        deleteEmployeeById(2L);
    }

    public static void deleteEmployeeById(long id) {
        //напишите тут ваш код

    }
}
