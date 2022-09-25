package com.javarush.task.pro.task12.task1228;

/* 
   Только для спасателей!
*/

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static List<String> secretMessage = List.of(
            "защ", "ита", "тит", "ити", "e ", "от ", "те ", "пож", "баг", "от ", "алу", "йст", "ужа", "сно", "й ",
            "сны", "е ", "осв", "х г", "обо", "быс", "ала", "кти", "чны", "баг", "ско", "пле", "ов ", "рее", "ние",
            "и ", "реш", "отп", "выз", "ен ", "уск", "вол", "те ", "нос", "ите", "каж", "нет", " из", "но ", "все",
            " ин", "отк", "ите", "ста", "пож", "ар ", "мат", "алу", " бу", "риц", "рат.", "ыт.", "ы.");

    public static void main(String[] args) {
        List<String> decryptedMessage = decryptSecretMessage();

        for (String s : decryptedMessage) {
            System.out.print(s);
        }
    }

    public static List<String> decryptSecretMessage() {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < secretMessage.size(); i += 3) {
            String string = secretMessage.get(i);
            list.add(string);
        }
        return list;
    }
}