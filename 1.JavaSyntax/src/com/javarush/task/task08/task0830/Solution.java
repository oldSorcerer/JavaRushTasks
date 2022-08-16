package com.javarush.task.task08.task0830;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
        }

        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (isGreaterThan(array[j], array[j + 1])) {
                    String tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
   /*     String g;
        for(int i=0;i<array.length;i++){

            for(int j=0;j<array.length;j++){
                 if (isGreaterThan(array[i].toLowerCase(),array[j].toLowerCase())){
                     g=array[j];
                     array[j]=array[i];
                     array[i]=g;
                }
            }
        }*/
        //напишите тут ваш код
    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }
}
/*Задача по алгоритмам
        Задача: Введи с клавиатуры 20 слов и выведи их в алфавитном порядке. Каждое слово - с новой строки.


        Требования:
        1. Программа должна выводить текст на экран.
        2. Программа должна считывать значения с клавиатуры.
        3. Класс Solution должен содержать три метода.
        4. Метод main() должен вызывать метод sort().
        5. Метод sort() должен вызывать метод isGreaterThan().
        6. Выведенные слова должны быть отсортированы в алфавитном порядке.*/