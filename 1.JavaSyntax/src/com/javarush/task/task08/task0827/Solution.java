package com.javarush.task.task08.task0827;

import java.text.*;
import java.util.Date;
import java.util.Locale;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));

    }

    public static boolean isDateOdd(String date) {
        SimpleDateFormat dateFormat =new SimpleDateFormat("MMMM d yyyy", Locale.ENGLISH);
        String firstYear = "JANUARY 1 "+date.substring(date.length()-4,date.length());
       // System.out.println( firstYear);
        boolean res =false;
        try {
            Long d = dateFormat.parse(date).getTime();
            Long dFirst = dateFormat.parse(firstYear).getTime();
            Long result=(d-dFirst)/1000/60/60/24+1;
        //    System.out.println( result);
            res=result%2==0?false:true;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return res;
    }
}
/*Работа с датой
        1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
        2. String date передается в формате FEBRUARY 1 2013
        Не забудьте учесть первый день года.
31 28 31 30 1
        Пример:
        JANUARY 1 2000 = true
        JANUARY 2 2020 = false


        Требования:
        1. Программа должна выводить текст на экран.
        2. Класс Solution должен содержать два метода.
        3. Метод isDateOdd() должен возвращать true, если количество дней с начала года - нечетное число, иначе false.
        4. Метод main() должен вызывать метод isDateOdd().*/