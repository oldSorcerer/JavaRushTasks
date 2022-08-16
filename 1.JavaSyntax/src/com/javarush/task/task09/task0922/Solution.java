package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String dateString = r.readLine();
        r.close();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date d = dateFormat.parse(dateString);
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("MMM dd, yyyy",Locale.ENGLISH);
        System.out.println(dateFormat1.format(d).toUpperCase() );
        //напишите тут ваш код
    }
}
/*  SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = dateFormat.parse( d );
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("MMM dd, yyyy",Locale.ENGLISH);
        System.out.println(dateFormat1.format(date).toUpperCase() );


        Ввести с клавиатуры дату в формате "08/18/2013"
Вывести на экран эту дату в виде "AUG 18, 2013".
Воспользоваться объектом Date и SimpleDateFormat.


Требования:
1. Программа должна считывать данные с клавиатуры.
2. В программе должна быть объявлена переменная типа SimpleDateFormat.
3. В программе должна быть объявлена переменная типа Date.
4. Программа должна выводить данные на экран.
5. Вывод должен соответствовать заданию.*/