package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        ArrayList<int[]> a = new ArrayList<>();
        int[] b =  {1,1,2,3,4};
        int[] c =  {1,1};
        int[] d =  {1,1,2,3};
        int[] e =  {1,1,2,3,4,3,4};
        int[] f =  {};
        a.add(b);
        a.add(c);
        a.add(d);
        a.add(e);
        a.add(f);
return a;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
/*Список из массивов чисел
Создать список, элементами которого будут массивы чисел.
Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно.
Заполнить массивы любыми данными и вывести их на экран.


Требования:
1. Метод createList должен объявлять и инициализировать переменную типа ArrayList.
2. Метод createList должен возвращать созданный список.
3. Метод createList должен добавлять в список 5 элементов.
4. Каждый элемент в списке должен быть массивом чисел. Длина первого должна быть 5 элементов, второго - 2, следующих - 4, 7, 0 соответственно.
5. Программа должна выводить на экран элементы всех массивов из списка. Каждый элемент с новой строки.*/