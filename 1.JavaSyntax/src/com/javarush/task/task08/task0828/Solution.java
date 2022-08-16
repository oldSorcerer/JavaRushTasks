package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        HashMap<String,Integer> q = new HashMap<>();

   /*     January
                February
        March
                April
        May
                June
        July
                August
        September
                October
        November
                December*/

        q.put("January",1);
        q.put("February",2);
        q.put("March",3);
        q.put("April",4);
        q.put("May",5);
        q.put("June",6);
        q.put("July",7);
        q.put("August",8);
        q.put("September",9);
        q.put("October",10);
        q.put("November",11);
        q.put("December",12);
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String s =  r.readLine();
     System.out.println(s+" is "+q.get(s)+" month");
    }
}
/*Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.


Требования:
1. Программа должна выводить текст на экран.
2. Программа должна считывать значения с клавиатуры.
3. Класс Solution должен содержать один метод.
4. Программа должна использовать коллекции.
5. Программа должна считывать с клавиатуры имя месяца и выводить его номер на экран по заданному шаблону.*/