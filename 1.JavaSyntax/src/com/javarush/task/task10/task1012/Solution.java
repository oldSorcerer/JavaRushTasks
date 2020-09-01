package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }
        String str = String.join("", list);

        List<Character> charList = new ArrayList<>();

        for (int i = 0; i < str.length(); i++)
            charList.add(str.charAt(i));

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (Character character : alphabet) {
            map.put(character, Collections.frequency(charList, character));
            System.out.println(character + " " + map.get(character));
        }

        /*String str = String.join("", list);

        for (Character character : alphabet) {
            String strNew = str.replaceAll(String.valueOf(character), "");
            System.out.println(character + " " + (str.length() - strNew.length()));
        }
*/



    }

}
