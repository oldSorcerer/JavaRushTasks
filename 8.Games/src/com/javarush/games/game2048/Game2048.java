package com.javarush.games.game2048;

import com.javarush.engine.cell.*;

public class Game2048 extends Game{
    
    private static final int SIDE = 4;
    
    private int[][] gameField = new int[SIDE][SIDE];
    
    private void createGame() {
        createNewNumber();
        createNewNumber();
    }
    
    private void drawScene() {
        for(int y = 0; y < SIDE; y++)
            for (int x = 0; x < SIDE; x++)
                setCellColoredNumber(x, y, gameField[y][x]);
    }
    
    @Override
    public void initialize() {
        setScreenSize(SIDE, SIDE);
        createGame();
        drawScene();
    }

    private void createNewNumber() {
        int x = getRandomNumber(SIDE);
        int y = getRandomNumber(SIDE);
        int number = getRandomNumber(10);
        if (gameField[x][y] == 0) {
            if (number < 9) {
                gameField[x][y] = 2;
            }
            else
                gameField[x][y] = 4;
        } else
            createNewNumber();
    }

    private Color getColorByValue(int value) {
        switch (value) {
            case 0:
                return Color.WHITE;
            case 2:
                return Color.PLUM;
            case 4:
                return Color.SLATEBLUE;
            case 8:
                return Color.DODGERBLUE;
            case 16:
                return Color.DARKTURQUOISE;
            case 32:
                return Color.MEDIUMSEAGREEN;
            case 64:
                return Color.LIMEGREEN;
            case 128:
                return Color.DARKORANGE;
            case 256:
                return Color.SALMON;
            case 512:
                return Color.ORANGERED;
            case 1024:
                return Color.DEEPPINK;
            case 2048:
                return Color.MEDIUMVIOLETRED;
            default:
                return Color.NONE;
        }
    }

    private void setCellColoredNumber(int x, int y, int value) {
        Color newColor = getColorByValue(value);
        String strValue = value > 0 ? "" + value : "";
        setCellValueEx(x, y,newColor, strValue);
    }

    private boolean compressRow(int[] row) {
        int insertPosition = 0;
        boolean result = false;
        for (int x = 0; x < SIDE; x++) {
            if (row[x] > 0 ) {
                if (x  != insertPosition) {
                    row[insertPosition] = row[x];
                    row[x] = 0;
                    result = true;
                }
                insertPosition++;
            }
        }
        return result;
    }

    private boolean mergeRow(int[] row) {
        boolean result = false;
        for (int i = 0; i < row.length - 1; i++) {
            if (row[i] != 0 && row[i] == row[i + 1]) {
                row[i] += row[i + 1];
                row[i + 1] = 0;
                result = true;
            }
        }
        return result;
    }

    @Override
    public void onKeyPress(Key key) {
        if (key == Key.LEFT) {
            moveLeft();
            drawScene();
        } else if (key == Key.RIGHT) {
            moveRight();
            drawScene();
        } else if (key == Key.UP) {
            moveUp();
            drawScene();
        } else if (key == Key.DOWN) {
            moveDown();
            drawScene();
        }

    }

    private void moveLeft() {
        boolean flag = false;
        for (int[] ints : gameField) {
            if (compressRow(ints) | mergeRow(ints) | compressRow(ints) ) {
                flag = true;
            }
        }
        if (flag) {
            createNewNumber();
        }
    }

    private void moveRight() {

    }

    private void moveUp() {

    }

    private void moveDown() {

    }

}