package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        InputStream inputStream = new FileInputStream(reader.readLine());

        BufferedReader fileReader = new BufferedReader(new InputStreamReader(inputStream));

        ArrayList<Integer> list = new ArrayList<>();

        while (fileReader.ready()) {

            int number = Integer.parseInt(fileReader.readLine());
            if (number % 2 == 0) {
                list.add(number);
            }
        }

        Collections.sort(list);

        for (Integer tmp : list) {
            System.out.println(tmp);
        }

        inputStream.close();
    }
}
