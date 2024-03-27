package com.javarush.task.task35.task3513;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Model {
    protected int score;
    protected int maxTile;
    private static final int FIELD_WIDTH = 4;
    private Tile[][] gameTiles = new Tile[FIELD_WIDTH][FIELD_WIDTH];

    public Model() {
        resetGameTiles();
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

    private void compressTiles(Tile[] tiles) {
        int insertPosition = 0;
        for (int i = 0; i < tiles.length; i++) {
            if (!tiles[i].isEmpty()) {
                if (i != insertPosition) {
                    tiles[insertPosition] = tiles[i];
                    tiles[i] = new Tile();
                }
                insertPosition++;
            }
        }
    }

    private void mergeTiles(Tile[] tiles) {
        for (int i = 0; i < tiles.length - 1; i++) {
            if (!tiles[i].isEmpty() && tiles[i].value == tiles[i + 1].value) {
                tiles[i].value += tiles[i + 1].value;
                tiles[i + 1].value = 0;
                score += tiles[i].value;
            }
        }
    }
}
