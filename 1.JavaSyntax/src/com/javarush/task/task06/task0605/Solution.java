package com.javarush.task.task06.task0605;


import java.io.*;

/* 
Контролируем массу тела
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double weight = Double.parseDouble(reader.readLine());
        double height = Double.parseDouble(reader.readLine());

        Body.massIndex(weight, height);
    }

    public static class Body {
        public static void massIndex(double weight, double height) {
            double a = weight / (height * height);
            if (a < 18.5)
                System.out.println("Недовес: меньше чем 18.5");
            else if ((a >= 18.5) && (a <= 24.9))
                System.out.println("Нормальный: между 18.5 и 24.9");
            else if ((a >= 25) && (a <= 29.9))
                System.out.println("Избыточный вес: между 25 и 29.9");
            else if (a >= 30)
                System.out.println("Ожирение: 30 или больше");
        }
    }
}