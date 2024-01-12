package com.javarush.games.ticktacktoe;

import com.javarush.engine.cell.Game;

public class TicTacToeGame extends Game {
    private int[][] model = new int[3][3];
    private int currentPlayer;


    @Override
    public void initialize() {
        setScreenSize(3, 3);
    }
}
