package com.javarush.games.snake;

import java.util.*;
import com.javarush.engine.cell.*;

public class Snake {
    private List<GameObject> snakeParts = new ArrayList<>();
    
    private static final String HEAD_SIGN = "\uD83D\uDC7E";
    private static final String BODY_SIGN = "\u26AB";
    
    public Snake(int x, int y) {
        GameObject obj1 = new GameObject(x, y);
        GameObject obj2 = new GameObject(x + 1, y);
        GameObject obj3 = new GameObject(x + 2, y);
    
        snakeParts.add(obj1);
        snakeParts.add(obj2);
        snakeParts.add(obj3);
    }
    
    public void draw(Game game) {
        game.setCellValue(snakeParts.get(0).x, snakeParts.get(0).y, HEAD_SIGN);

        for (int i = 1; i < snakeParts.size(); i++)
            game.setCellValue(snakeParts.get(i).x, snakeParts.get(i).y, BODY_SIGN);

    }
}