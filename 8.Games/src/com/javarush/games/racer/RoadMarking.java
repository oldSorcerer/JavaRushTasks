package com.javarush.games.racer;

import com.javarush.engine.cell.Game;

import java.util.ArrayList;
import java.util.List;

public class RoadMarking {

    private List<GameObject> roadMarking = new ArrayList<>();

    public RoadMarking() {
        for (int i = -4; i <= RacerGame.HEIGHT + 4; i += 8) {
            roadMarking.add(new GameObject(RacerGame.CENTER_X - 9, i, ShapeMatrix.ROAD_MARKING));
            roadMarking.add(new GameObject(RacerGame.CENTER_X + 9, i, ShapeMatrix.ROAD_MARKING));
        }
    }

    public void move(int boost) {
        for (GameObject item : roadMarking) {
            if (item.y >= RacerGame.HEIGHT - 1) {
                item.y = item.y - RacerGame.HEIGHT - 8 + boost;
            } else {
                item.y += boost;
            }
        }
    }

    public void draw(Game game) {
        for (GameObject item : roadMarking) {
            item.draw(game);
        }
    }
}
