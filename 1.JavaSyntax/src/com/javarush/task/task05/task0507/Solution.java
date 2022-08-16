package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int a ,b=0,c=0;
        while (true) {
            a=Integer.parseInt(r.readLine());
            if (a!=-1) {
            b = b+a;
            c++; }
            else break;
        }
            System.out.print( ((double)b/(double)c));
    }

}
/*Вводить с клавиатуры числа и вычислить среднее арифметическое.
Если пользователь ввел -1, вывести на экран среднее арифметическое всех чисел и завершить программу.
-1 не должно учитываться.

Пример для чисел 1 2 2 4 5 -1:
2.8

Пример для чисел 4 3 2 1 -1:
2.5


Требования:
1. Программа должна считывать данные с клавиатуры.
2. Программа должна выводить данные на экран.
3. Если ввести: 1 2 2 4 5 -1, программа должна вывести 2.8.
4. Если ввести: -100 0 100 -1, программа должна вывести 0.0.
5. Если ввести: 1 -1, программа должна вывести 1.0.
6. Выведенный результат должен соответствовать заданию для любых входных данных.*/

