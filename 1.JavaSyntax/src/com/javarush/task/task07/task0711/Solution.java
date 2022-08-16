package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        ArrayList<String> list = new ArrayList<>();
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        for(int i=0;i<5;i++){
            list.add(r.readLine());
        }
String swap;
        for(int i=0;i<13;i++){
            swap=list.get(4);
            for(int y=4;y>0;y--){
                list.set(y,list.get(y-1));

            }
            list.set(0,swap);

           /* System.out.println();
            for(int q=0;q<5;q++){
               System.out.println(list.get(q));
            }*/

        }

        for(int q=0;q<5;q++){
            System.out.println(list.get(q));
        }
    }
}
/*


    далить и вставить
1. Создай список строк.
2. Добавь в него 5 строк с клавиатуры.
3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.


Требования:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Программа должна считывать 5 строк с клавиатуры и добавлять их в список.
3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
4. Программа должна выводить список на экран, каждое значение с новой строки.*/