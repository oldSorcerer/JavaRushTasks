package com.javarush.task.task35.task3513;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Model {
    protected int score;
    protected int maxTile;
    private static final int FIELD_WIDTH = 4;
    private Tile[][] gameTiles = new Tile[FIELD_WIDTH][FIELD_WIDTH];

    private Stack<Tile[][]> previousStates = new Stack<>();
    private Stack<Tile[][]> previousScores = new Stack<>();

    private boolean isSaveNeeded = true;

    public Model() {
        resetGameTiles();
    }

    private void saveState(Tile[][] tiles) {
        previousStates.push(tiles);



        isSaveNeeded = false;
    }

    public void rollback() {
        if (!previousScores.isEmpty()) {
            Tile[][] tiles = previousScores.pop();

        }

    }

    private void addTile() {
        List<Tile> emptyTiles = getEmptyTiles();
        if (!emptyTiles.isEmpty()) {
            int index = (int) (emptyTiles.size() * Math.random());

            Tile tile = emptyTiles.get(index);

            tile.value = Math.random() < 0.9 ? 2 : 4;
        }
    }

    private List<Tile> getEmptyTiles() {
        List<Tile> emptyTiles = new ArrayList<>();
        for (int i = 0; i < gameTiles.length; i++) {
            for (int j = 0; j < gameTiles[i].length; j++) {
                if (gameTiles[i][j].isEmpty()) {
                    emptyTiles.add(gameTiles[i][j]);
                }
            }
        }
        return emptyTiles;
    }

    public void resetGameTiles() {
        for (Tile[] gameTile : gameTiles) {
            Arrays.fill(gameTile, new Tile());
        }
        addTile();
        addTile();
    }

    private boolean compressTiles(Tile[] tiles) {
        boolean result = false;
        int insertPosition = 0;
        for (int i = 0; i < tiles.length; i++) {
            if (!tiles[i].isEmpty()) {
                if (i != insertPosition) {
                    tiles[insertPosition] = tiles[i];
                    tiles[i] = new Tile();
                    result = true;
                }
                insertPosition++;
            }
        }
        return result;
    }

    private boolean mergeTiles(Tile[] tiles) {
        boolean result = false;
        for (int i = 0; i < tiles.length - 1; i++) {
            if (!tiles[i].isEmpty() && tiles[i].value == tiles[i + 1].value) {
                tiles[i].value += tiles[i + 1].value;
                if (tiles[i].value > maxTile) {
                    maxTile = tiles[i].value;
                }
                tiles[i + 1].value = 0;
                result = true;
                score += tiles[i].value;
            }

        }
        for (int i = 0; i < tiles.length - 1; i++) {
            if (tiles[i].value == 0) {
                tiles[i].value = tiles[i + 1].value;
                tiles[i + 1].value = 0;
            }
        }
        return result;
    }

    public void left() {
        boolean moveFlag = false;
        for (Tile[] gameTile : gameTiles) {
            if (compressTiles(gameTile) | mergeTiles(gameTile)) {
                moveFlag = true;
            }
        }

        if (moveFlag) {
            addTile();
        }
    }

    public void right() {
        rotateClockwise();
        rotateClockwise();
        left();
        rotateClockwise();
        rotateClockwise();
    }

    public void up() {
        rotateClockwise();
        rotateClockwise();
        rotateClockwise();
        left();
        rotateClockwise();
    }

    public void down() {
        rotateClockwise();
        left();
        rotateClockwise();
        rotateClockwise();
        rotateClockwise();
    }

    private void rotateClockwise() {
        Tile[][] newGameTiles = new Tile[FIELD_WIDTH][FIELD_WIDTH];
        for (int i = 0; i < newGameTiles.length; i++) {
            for (int j = 0; j < newGameTiles[i].length; j++) {
                newGameTiles[j][FIELD_WIDTH - i - 1] = gameTiles[i][j];
            }
        }
        gameTiles = newGameTiles;
    }

    public boolean canMove() {
        if (!getEmptyTiles().isEmpty()) {
            return true;
        }
        for (int i = 0; i < FIELD_WIDTH; i++) {
            for (int j = 0; j < FIELD_WIDTH; j++) {
                Tile tile = gameTiles[i][j];
                if ((i < FIELD_WIDTH - 1 && tile.value == gameTiles[i + 1][j].value)
                    || (j < FIELD_WIDTH - 1 && tile.value == gameTiles[i][j + 1].value)) {
                    return true;
                }
            }
        }
        return false;
    }

    public Tile[][] getGameTiles() {
        return gameTiles;
    }
}
