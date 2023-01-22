package com.javarush.task.sql.task14.task1404;

import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.Collections;
import java.util.List;

/* 
task1404
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        List<Task> tasks = getTasks();
        tasks.forEach(System.out::println);
    }

    public static List<Task> getTasks() {
        //напишите тут ваш код
        return Collections.emptyList();
    }
}