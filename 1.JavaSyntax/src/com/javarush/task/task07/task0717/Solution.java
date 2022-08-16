package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // Считать строки с консоли и объявить ArrayList list тут
BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
ArrayList<String> list = new ArrayList<>();
for(int i = 0;i<10;i++){
    list.add(r.readLine());
}
        ArrayList<String> result = doubleValues(list);
for(String f:result){
    System.out.println(f);
}
        // Вывести на экран result
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        //напишите тут ваш код
        int t = list.size();
      //  System.out.println(t);
        for(int i=0;i<t;i++){
            list.add((i+1),list.get(i));
            i++;t++;
        }
                return list;
    }
}
/*Удваиваем слова
1. Введи с клавиатуры 10 слов в список строк.
2. Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
3. Выведи результат на экран, каждое значение с новой строки.


Требования:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Считай 10 строк с клавиатуры и добавь их в список.
3. Метод doubleValues должен удваивать элементы списка по принципу a,b,c -> a,a,b,b,c,c..
4. Выведи получившийся список на экран, каждый элемент с новой строки.*/