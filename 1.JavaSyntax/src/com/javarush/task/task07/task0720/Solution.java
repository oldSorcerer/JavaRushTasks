package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());

        ArrayList<String> list = new ArrayList<>();
     String a;
        for (int i=0;i<n;i++){
            list.add(reader.readLine());
        }


        for (int i=0;i<m;i++){
            a=list.get(0);
            list.remove(0);
            list.add(n-1,a);
           /* System.out.println();
            for(String g:list){
                System.out.println(g);
            }*/
        }
       // System.out.println();
        for(String g:list){
            System.out.println(g);
        }
        //напишите тут ваш код
    }
}
/*Перестановочка подоспела
Ввести с клавиатуры 2 числа N и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.

Примечание: запрещено создавать больше одного списка.


Требования:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Считай c клавиатуры числа N и M, считай N строк и добавь их в список.
3. Переставить M первых строк в конец списка.
4. Выведи список на экран, каждое значение с новой строки.*/