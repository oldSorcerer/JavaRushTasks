package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        for(int i=0;i<10;i++){
            list.add(r.readLine());
        }

        int minL=list.get(0).length();
        for (int i=0;i<10;i++){
            if (minL>list.get(i).length())
                minL=list.get(i).length();
        }

        int maxL=0;
        for(int i =0;i<10;i++){
            if (maxL<(list.get(i)).length()) {
                maxL = list.get(i).length();

            }
        }

       // int flag=0;//0-max 1 - min
        String str=null;

        for(int i =0;i<10;i++){
            if ((maxL==(list.get(i)).length())||(minL==(list.get(i)).length())) {
                str=list.get(i);
break;
            }

        }
        System.out.print(str);




    }
}
/*  int minL=list.get(0).length();
        for (int i=0;i<5;i++){
            if (minL>list.get(i).length())
                minL=list.get(i).length();
        }

        for (int i=0;i<5;i++){
            if (minL==list.get(i).length())
                System.out.println(list.get(i));
        }*/
/*1. Создай список строк.
2. Добавь в него 10 строчек с клавиатуры.
3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
Если таких строк несколько, то должны быть учтены самые первые из них.
4. Выведи на экран строку из п.3.


Требования:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Программа должна считывать 10 строк с клавиатуры и добавлять их в список.
3. Программа должна выводить на экран самую короткую строку, если она была раньше самой длинной.
4. Программа должна выводить на экран самую длинную строку, если она была раньше самой короткой.*/

/*  ArrayList<String> list = new ArrayList<>();
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        for(int i=0;i<10;i++){
            list.add(null);
        }
        for(int i=9;i>=0;i--){
            list.set(i, r.readLine());
        }


        for(int i=0;i<10;i++){
            System.out.println(list.get(i));
        }
    }*/