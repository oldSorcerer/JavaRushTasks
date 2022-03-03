package com.javarush.games.minigames.mini05;

import com.javarush.engine.cell.Game;
import com.javarush.engine.cell.Color;

/* 
Цвета радуги
*/

public class RainbowGame extends Game {

    @Override
    public void initialize() {
        setScreenSize(10, 7);
        for (int i = 0; i < 10; i++) {
            setCellColor(i, 0, Color.RED);
            setCellColor(i, 1, Color.ORANGE);
            setCellColor(i, 2, Color.YELLOW);
            setCellColor(i, 3, Color.GREEN);
            setCellColor(i, 4, Color.BLUE);
            setCellColor(i, 5, Color.INDIGO);
            setCellColor(i, 6, Color.VIOLET);
        }
    }
}
