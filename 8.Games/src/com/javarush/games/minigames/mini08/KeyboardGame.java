package com.javarush.games.minigames.mini08;

import com.javarush.engine.cell.*;

/* 
Работа с клавиатурой
*/

public class KeyboardGame extends Game {

    @Override
    public void initialize() {
        setScreenSize(3, 3);

        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                setCellColor(x, y, Color.WHITE);
            }
        }
    }

    @Override
    public void onKeyPress(Key key) {
        if (key == Key.LEFT) {
            for (int i = 0; i < 3; i++) {
                setCellColor(0, i, Color.GREEN);
            }
        } else if (key == Key.RIGHT) {
            for (int i = 0; i < 3; i++) {
                setCellColor(2, i, Color.GREEN);
            }
        } else if (key == Key.UP) {
            for (int i = 0; i < 3; i++) {
                setCellColor(i, 0, Color.GREEN);
            }
        } else if (key == Key.DOWN) {
            for (int i = 0; i < 3; i++) {
                setCellColor(i, 2, Color.GREEN);
            }
        }
    }

    @Override
    public void onKeyReleased(Key key) {
        if (key == Key.LEFT) {
            for (int i = 0; i < 3; i++) {
                setCellColor(0, i, Color.WHITE);
            }
        }else if (key == Key.RIGHT) {
            for (int i = 0; i < 3; i++) {
                setCellColor(2, i, Color.WHITE);
            }
        } else if (key == Key.UP) {
            for (int i = 0; i < 3; i++) {
                setCellColor(i, 0, Color.WHITE);
            }
        } else if (key == Key.DOWN) {
            for (int i = 0; i < 3; i++) {
                setCellColor(i, 2, Color.WHITE);
            }
        }
    }
}
