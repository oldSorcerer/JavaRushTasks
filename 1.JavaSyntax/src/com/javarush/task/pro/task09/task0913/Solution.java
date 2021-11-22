package com.javarush.task.pro.task09.task0913;

/* 
Поиск в строке
*/

public class Solution {
    public static void main(String[] args) {
        String string = "Чтобы стать программистом, нужно писать код. Чтобы писать код, нужно учиться. Чтобы учиться, нужно желание.";
        String word = "код";
        int indexFromFirstWord = getIndexFromFirstWord(string, word);
        int indexFromLastWord = getIndexFromLastWord(string, word);
        System.out.println("Индекс первого символа первого слова \"" + word + "\" равен - " + indexFromFirstWord);
        System.out.println("Индекс первого символа последнего слова \"" + word + "\" равен - " + indexFromLastWord);
    }

    public static int getIndexFromFirstWord(String string, String word) {
        return string.indexOf(word);
    }

    public static int getIndexFromLastWord(String string, String word) {
        return string.lastIndexOf(word);
    }
}
