package com.javarush.task.task29.task2910;

/* 
Это архаичное слово "Биатлон"
*/

public class Solution {

    public static void main(String[] args) {
        Game game = new Game();
        printDelimiter();
        game.startCompetition();
        System.out.println("\n\nВСЕ РЕЗУЛЬТАТЫ:");
        game.printAllResults();
        printDelimiter();
        System.out.println("\n\nСПОРТСМЕНЫ С ТАКИМ ЖЕ ИТОГОВЫМ ВРЕМЕНЕМ, КАК У КОНТРОЛЬНОГО СПОРТСМЕНА:");
        game.printSportsmanWithEqualTime();
        printDelimiter();
    }

    private static void printDelimiter() {
        System.out.println("=================================================================================================");
    }
}