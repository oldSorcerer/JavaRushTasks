package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> k = new ArrayList<Integer>();
        for(int i = 0;i<20;i++){
            k.add(Integer.parseInt(r.readLine()));
        }

        ArrayList<Integer> k1 = new ArrayList<Integer>();
        ArrayList<Integer> k2 = new ArrayList<Integer>();
        ArrayList<Integer> k3 = new ArrayList<Integer>();

        for(int i = 0;i<20;i++){
           if ((k.get(i)%3==0)||(k.get(i)%2==0)) {
               if (k.get(i) % 3 == 0)
                   k1.add(k.get(i));
               if (k.get(i) % 2 == 0)
                   k2.add(k.get(i));
           }
          else
                k3.add(k.get(i));
        }

        printList(k1);
        printList(k2);
        printList(k3);
    }

    public static void printList(List<Integer> list) {
        //напишите тут ваш код
        for(Integer r : list){
            System.out.println(r);
        }
    }
}
/*Играем в Jолушку
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число нацело делится на 3 (x%3==0), нацело делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.


Требования:
1. Объяви и сразу проинициализируй 4 переменных типа ArrayList (список целых чисел). Первый список будет главным, а остальные - дополнительными.
2. Считать 20 чисел с клавиатуры и добавить их в главный список.
3. Добавить в первый дополнительный список все числа из главного, которые нацело делятся на 3.
4. Добавить во второй дополнительный список все числа из главного, которые нацело делятся на 2.
5. Добавить в третий дополнительный список все остальные числа из главного.
6. Метод printList должен выводить на экран все элементы переданного списка, каждый с новой строки.
7. Программа должна вывести три дополнительных списка, используя метод printList.*/