package com.javarush.task.task08.task0810;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* 
Время для 10 тысяч вызовов get
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getTimeMsOfGet(fill(new ArrayList())));
        System.out.println(getTimeMsOfGet(fill(new LinkedList())));
    }

    public static List fill(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(new Object());
        }
        return list;
    }

    public static long getTimeMsOfGet(List list) {
        //напишите тут ваш код
        Date d1 = new Date();
        long s1 = d1.getTime();
        get10000(list);
        Date d2 = new Date();
        long s2 = d2.getTime();
        return s2-s1;
        //напишите тут ваш код
/*Date d1 = new Date();
long s1 = d1.getTime();
        insert10000(list);
        Date d2 = new Date();
        long s2 = d2.getTime();
        return s2-s1;*/
    }

    public static void get10000(List list) {
        if (list.isEmpty()) return;
        int x = list.size() / 2;

        for (int i = 0; i < 10000; i++) {
            list.get(x);
        }
    }
}
/*Измерить, сколько времени занимает 10 тысяч вызовов get для каждого списка.
Метод getTimeMsOfGet должен вернуть время своего исполнения в миллисекундах.


Требования:
1. Программа должна выводить числа на экран.
2. Метод main должен вызывать метод getTimeMsOfGet только два раза.
3. Метод main должен вызывать метод fill только два раза.
4. Метод fill(List list) должен вставлять 10 тысяч элементов в список.
5. Метод get10000(List list) должен производить 10 тысяч вызовов get для списка.
6. Метод getTimeMsOfGet должен вызывать метод get10000(List list) только один раз.
7. Метод getTimeMsOfGet должен вернуть время в миллисекундах, которое занимает 10 тысяч вызовов get для списка.*/