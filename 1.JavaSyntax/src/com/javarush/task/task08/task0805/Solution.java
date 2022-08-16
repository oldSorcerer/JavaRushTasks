package com.javarush.task.task08.task0805;

import java.util.HashMap;
import java.util.Map;

/* 
На экране — значения!
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Sim", "Sim");
        map.put("Tom", "Tom");
        map.put("Arbus", "Arbus");
        map.put("Baby", "Baby");
        map.put("Cat", "Cat");
        map.put("Dog", "Dog");
        map.put("Eat", "Eat");
        map.put("Food", "Food");
        map.put("Gevey", "Gevey");
        map.put("Hugs", "Hugs");

        printValues(map);
    }

    public static void printValues(Map<String, String> map) {
        //напишите тут ваш код
        for(Map.Entry<String,String> o:map.entrySet()){
            System.out.println(o.getValue());
        }
    }
}
/*На экране — значения!
Есть коллекция HashMap<String, String>, туда занесли 10 различных строк.
Вывести на экран список значений, каждый элемент с новой строки.


Требования:
1. Программа должна создавать переменную коллекции HashMap с типом элементов String, String. Переменная должна быть сразу проинициализирована.
2. Программа не должна считывать значения с клавиатуры.
3. Программа должна добавлять в коллекцию 10 различных строк, согласно условию.
4. Метод printValues() должен выводить на экран список значений коллекции, каждый элемент с новой строки.*/