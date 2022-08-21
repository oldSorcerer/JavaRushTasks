package com.javarush.task.task20.task2019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Исправить ошибку. Сериализация
*/

public class Solution implements Serializable {

    public static void main(String[] args) throws Exception {
        try (FileOutputStream fileOutput = new FileOutputStream("your.file.name");
             ObjectOutputStream outputStream = new ObjectOutputStream(fileOutput)) {

            Solution solution = new Solution();
            outputStream.writeObject(solution);
        }

        //load
        try (FileInputStream fiStream = new FileInputStream("your.file.name");
             ObjectInputStream objectStream = new ObjectInputStream(fiStream)) {

            Solution loadedObject = (Solution) objectStream.readObject();

            fiStream.close();
            objectStream.close();

            //Attention!!
            System.out.println(loadedObject.size());
        }
    }

    private final Map<String, String> m = new HashMap<>();

    public Solution() {
        m.put("Mickey", "Mouse");
        m.put("Mickey", "Mantle");
    }

    public Map<String, String> getMap() {
        return m;
    }

    public int size() {
        return m.size();
    }
}
