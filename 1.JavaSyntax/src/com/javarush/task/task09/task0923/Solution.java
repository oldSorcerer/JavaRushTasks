package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        char[] chars = string.toCharArray();
        String gl = "";
        String sogl = "";
        for (char t : chars) {
            if (isVowel(t)) {
                gl = gl + t + " ";
            } else if (t != ' ')
                sogl = sogl + t + " ";
        }
        System.out.println(gl);
        System.out.println(sogl);
    }

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);

        for (char d : vowels) {
            if (c == d)
                return true;
        }
        return false;
    }
}