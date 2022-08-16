package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] r = new int[5];
        for(int i=0;i<5;i++){
            r[i]=Integer.parseInt(reader.readLine());
        }
        int w;
for(int i=0;i<5;i++){
            for (int y=0;y<5;y++){
              if (r[y]>r[i]){
                  w=r[y];
                  r[y]=r[i];
                  r[i]=w;
              }
            }
}

        for(int i=0;i<5;i++){
            System.out.println(r[i]);
        }
        //напишите тут ваш код
    }
}
/*Числа по возрастанию
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.

Пример ввода:
3
2
15
6
17

Пример вывода:
2
3
6
15
17


Требования:
1. Программа должна считывать 5 чисел с клавиатуры.
2. Программа должна выводить 5 чисел, каждое с новой строки.
3. Выведенные числа должны быть отсортированы по возрастанию.
4. Вывод должен содержать те же числа, что и были введены (порядок не важен).*/