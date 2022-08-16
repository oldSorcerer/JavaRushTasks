package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String t;
        int s=0;
        while (true) {
           t =  r.readLine();
           if (t.equals("сумма")) break;
           else s=s+Integer.parseInt(t);
        }
        System.out.print(s);
    }
}
/*Вводить с клавиатуры числа и считать их сумму, пока пользователь не введет слово «сумма».
Вывести на экран полученную сумму.


Требования:
1. Программа должна считывать данные с клавиатуры.
2. Программа должна корректно работать, если пользователь ввел одно число и слово «сумма».
3. Программа должна корректно работать, если пользователь ввел два числа число и слово «сумма».
4. Программа должна корректно работать, если пользователь ввел более двух чисел и слово «сумма».
5. Программа должна выводить текст на экран.
6. Программа должна прекращать считывать данные с клавиатуры после того пользователь введет слово "сумма" и нажмет Enter.*/