package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }

    static {
        try {
            reset();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static CanFly result;

    public static void reset() throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String word = rd.readLine();
        if (word.equals("helicopter"))
            result = new Helicopter();
        if (word.equals("plane")) {
            int volume = Integer.parseInt(rd.readLine());
            result = new Plane(volume);
        }
        //rd.close();
    }
}
