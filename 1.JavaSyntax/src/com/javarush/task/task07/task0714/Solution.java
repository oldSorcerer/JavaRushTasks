package com.javarush.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Слова в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> k = new ArrayList<>();
        for(int i = 0;i<5;i++){
            k.add(r.readLine());
        }
        k.remove(2);

        for(int i = 3;i>=0;i--){
           System.out.println(k.get(i));
        }
    }
}


/*Введи с клавиатуры 5 слов в список строк. Удали 3 — ий элемент списка, и выведи оставшиеся элементы в обратном порядке.


Требования:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Считай 5 строк с клавиатуры и добавь их в список.
3. Удали третий элемент массива.
4. Выведи элементы на экран.
5. Порядок вывода должен быть обратный.*/