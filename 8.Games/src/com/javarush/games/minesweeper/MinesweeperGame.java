package com.javarush.games.minesweeper;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

import java.util.ArrayList;
import java.util.List;

public class MinesweeperGame extends Game {
    private static final int SIDE = 9;

    private static final String MINE = "\uD83D\uDCA3";
    private static final String FLAG = "\uD83D\uDEA9";

    private GameObject[][] gameField = new GameObject[SIDE][SIDE];

    private int countMinesOnField;
    private int countFlags;
    private int countClosedTiles = SIDE * SIDE;
    private int score;

    private boolean isGameStopped;

    @Override
    public void initialize() {
        setScreenSize(SIDE, SIDE);
        createGame();
    }

    @Override
    public void onMouseLeftClick(int x, int y) {
        if (isGameStopped) {
            restart();
            return;
        }
        openTile(x, y);
    }

    @Override
    public void onMouseRightClick(int x, int y) {
        markTile(x, y);
    }

    private void createGame() {
        for (int y = 0; y < SIDE; y++) {
            for (int x = 0; x < SIDE; x++) {
                boolean isMine = getRandomNumber(10) < 1;
                if (isMine) {
                    countMinesOnField++;
                }
                gameField[y][x] = new GameObject(x, y, isMine);
                setCellValueEx(x, y, Color.ORANGE, "");
            }
        }
        countMineNeighbors();
        countFlags = countMinesOnField;
    }

    private List<GameObject> getNeighbors(GameObject gameObject) {
        List<GameObject> result = new ArrayList<>();
        for (int y = gameObject.y - 1; y <= gameObject.y + 1; y++) {
            for (int x = gameObject.x - 1; x <= gameObject.x + 1; x++) {
                if (y < 0 || y >= SIDE) {
                    continue;
                }
                if (x < 0 || x >= SIDE) {
                    continue;
                }
                if (gameField[y][x] == gameObject) {
                    continue;
                }
                result.add(gameField[y][x]);
            }
        }
        return result;
    }

    private void countMineNeighbors() {
        for (int y = 0; y < SIDE; y++) {
            for (int x = 0; x < SIDE; x++) {
                GameObject cell = gameField[y][x];
                if (!cell.isMine) {
                    List<GameObject> listNeighbors = getNeighbors(cell);
                    for (GameObject neighborCell : listNeighbors) {
                        if (neighborCell.isMine) {
                            cell.countMineNeighbors++;
                        }
                    }
                }
            }
        }
    }

    private void openTile(int x, int y) {
        GameObject cell = gameField[y][x];
        if (!cell.isOpen && !cell.isFlag && !isGameStopped) {
            cell.isOpen = true;
            if (!cell.isMine) {
                score +=5;
                setScore(score);
            }
            countClosedTiles--;
            setCellColor(x, y, Color.GREEN);
            if (cell.isMine) {
                setCellValueEx(cell.x, cell.y, Color.RED, MINE);
                gameOver();
            } else if (cell.countMineNeighbors == 0) {
                setCellValue(cell.x, cell.y, "");
                List<GameObject> listNeighbors = getNeighbors(cell);
                for (GameObject neigborCell : listNeighbors) {
                    if (!neigborCell.isOpen) {
                        openTile(neigborCell.x, neigborCell.y);
                    }
                }
            } else {
                setCellNumber(x, y, cell.countMineNeighbors);
            }
        }
        if (countClosedTiles == countMinesOnField && !cell.isMine) {
            win();
        }
    }

    private void markTile(int x, int y) {
        GameObject cell = gameField[y][x];
        if (!cell.isFlag && !cell.isOpen && countFlags != 0) {
            cell.isFlag = true;
            countFlags--;
            setCellValue(cell.x, cell.y, FLAG);
            setCellColor(cell.x, cell.y, Color.YELLOW);
        } else if (cell.isFlag && !cell.isOpen) {
            cell.isFlag = false;
            countFlags++;
            setCellValue(cell.x, cell.y, "");
            setCellColor(cell.x, cell.y, Color.ORANGE);
        }
    }

    private void gameOver() {
        isGameStopped = true;
        showMessageDialog(Color.NONE, "GAME OVER", Color.RED, 75);
    }

    private void win() {
        isGameStopped = true;
        showMessageDialog(Color.NONE, "YOU WIN", Color.VIOLET, 75);
    }

    private void restart() {
        isGameStopped = false;
        countClosedTiles = SIDE * SIDE;
        score = 0;
        countMinesOnField = 0;
        setScore(score);
        createGame();
    }
}