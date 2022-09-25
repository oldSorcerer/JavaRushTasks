package com.javarush.task.pro.task11.task1131;

/* 
Мегабаттл: Багорэп против Ультраметалла
*/

public class SuperBattle {

    public static int currentRound = 1;

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            startNextRound(new BagoRap(), new UltraMetal());
        }

        System.out.printf("По итогу 20-ти раундов побеждает... %s!!!", UltraMetal.score > BagoRap.score ? "УЛЬТРАМЕТАААААЛ" : "БАГОРЭЭЭЭЭП");
    }

    public static void startNextRound(BagoRap rap, UltraMetal metal) {
        System.out.printf("Начинаем %d раунд!\n", currentRound);
        System.out.println("...настройка громкости багорэпа...");
        rap.volume++;
        System.out.println("...настройка громкости ультраметала...");
        metal.volume++;
        System.out.println("Врубаем баттл!!!");
        String winner;
        if (metal.volume > rap.volume) {
            winner = "УЛЬТРАМЕТАЛ";
            metal.score++;
        } else {
            winner = "БАГОРЭП";
            rap.score++;
        }
        System.out.printf("В %d раунде побеждает %s!!!\n", currentRound, winner);
        System.out.printf("Общий счет: рэп - %d, метал - %d\n\n", rap.score, metal.score);
        currentRound++;
    }
}
