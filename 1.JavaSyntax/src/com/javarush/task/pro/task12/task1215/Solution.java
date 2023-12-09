package com.javarush.task.pro.task12.task1215;

import java.util.ArrayList;

/* 
Разбираем пирамиду бокалов
*/

public class Solution {

    private static ArrayList<String> initList() {
        String glassTop     = "       🍷       ";
        String glassSecond  = "      🍷🍷      ";
        String glassThird   = "     🍷🍷🍷     ";
        String glassFourth  = "    🍷🍷🍷🍷    ";
        String glassFifth   = "   🍷🍷🍷🍷🍷   ";
        String glassSixth   = "  🍷🍷🍷🍷🍷🍷  ";
        String glassSeventh = " 🍷🍷🍷🍷🍷🍷🍷 ";
        String glassEighth  = "🍷🍷🍷🍷🍷🍷🍷🍷";
        ArrayList<String> list = new ArrayList<>();
        list.add(glassEighth);
        list.add(glassSeventh);
        list.add(glassSixth);
        list.add(glassFifth);
        list.add(glassFourth);
        list.add(glassThird);
        list.add(glassSecond);
        list.add(glassTop);
        return list;
    }

    public static void print(ArrayList<String> glasses) {
        for(int i = glasses.size() - 1; i >= 0; i--) {
            System.out.println(glasses.get(i));
        }
    }

    public static void removeGlassesReverse(ArrayList<String> glasses) {
        System.out.println("Начинаем разбирать пирамиду...");

        for (int i = 0; i < glasses.size(); i++) {
            glasses.remove(glasses.size() - 1);
            i--;
        }

        if(glasses.isEmpty()) {
            System.out.println("Пирамида разобрана!");
        }
    }

    public static void main(String[] args) {
        ArrayList<String> glasses = initList();
        print(glasses);

        removeGlassesReverse(glasses);
        print(glasses);
    }
}
