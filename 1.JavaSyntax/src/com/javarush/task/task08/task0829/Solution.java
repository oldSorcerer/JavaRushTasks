package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
       // List<String> addresses = new ArrayList<String>();
        HashMap<String,String> addresses = new HashMap<>();
        while (true) {
            String adr = reader.readLine();
            if (adr.isEmpty()) break;

            addresses.put(adr,reader.readLine());
        }
      //  System.out.println("---");
        //read home number
     //   int houseNumber = Integer.parseInt(reader.readLine());
        String city = reader.readLine();

       // if (0 <= houseNumber && houseNumber < addresses.size()) {
         //   String familySecondName = addresses.get(houseNumber);
            System.out.println(addresses.get(city));
        //}
    }
}
/*Модернизация ПО
        Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
        Новая задача: Программа должна работать не с номерами домов, а с городами:

        Пример ввода:
        Москва
        Ивановы
        Киев
        Петровы
        Лондон
        Абрамовичи

        Лондон

        Пример вывода:
        Абрамовичи


        Требования:
        1. Программа должна выводить текст на экран.
        2. Программа должна считывать значения с клавиатуры.
        3. Класс Solution должен содержать один метод.
        4. Программа должна вывести фамилию семьи по введенному городу.*/