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
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM d yyyy", Locale.ENGLISH);
        String firstYear = "JANUARY 1 " + date.substring(date.length() - 4, date.length());
        boolean res = false;
        try {
            Long d = dateFormat.parse(date).getTime();
            Long dFirst = dateFormat.parse(firstYear).getTime();
            long result = (d - dFirst) / 1000 / 60 / 60 / 24 + 1;
            //    System.out.println( result);
            res = (result % 2 == 0) ? false : true;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return res;
    }
}