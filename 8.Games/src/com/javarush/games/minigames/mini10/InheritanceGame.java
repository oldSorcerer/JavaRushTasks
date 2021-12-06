package com.javarush.games.minigames.mini10;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

/* 
Наследование
*/

public class InheritanceGame extends Game{

    @Override
    public void initialize() {
        setScreenSize(10,10);
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                setCellColor(x, y, Color.ORANGE);
            }
        }
        setTurnTimer(500);
    }

    @Override
    public void onTurn(int step) {
        int x = getRandomNumber(10);
        int y = getRandomNumber(10);
        setCellValue(x, y, "\uD83D\uDE09");
    }
}
