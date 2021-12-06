package com.javarush.games.minigames.mini03;

import com.javarush.engine.cell.Game;
import com.javarush.engine.cell.Color;

/* 
Простая программа
*/

public class SymbolGame extends Game {

    @Override
    public void initialize() {
        String javarush = "JAVARUSH";
        setScreenSize(8, 3);
        for (int i = 0; i < javarush.length() ; i++) {
            setCellValueEx(i, 1, Color.ORANGE, String.valueOf(javarush.charAt(i)));

        }
    }
}
