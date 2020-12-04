package com.javarush.games.spaceinvaders;

public class ShapeMatrix {
    public static final int[][] ENEMY = new int[][]{
            {7, 0, 7},
            {7, 7, 7},
            {0, 7, 0}
    };

    public static final int[][] PLAYER = new int[][]{
            {0, 0, 6, 0, 0},
            {0, 6, 6, 6, 0},
            {6, 6, 6, 6, 6}
    };

    public static final int[][] DEAD_PLAYER = new int[][]{
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0}
    };

    public static final int[][] WIN_PLAYER = new int[][]{
            {0, 0, 5, 0, 0},
            {0, 5, 5, 5, 0},
            {5, 5, 5, 5, 5}
    };

    public static final int[][] BULLET = new int[][]{
            {2},
            {2}
    };

    public static final int[][] KILL_ENEMY_ANIMATION_FIRST = new int[][]{
            {4, 4, 4},
            {4, 4, 4},
            {4, 4, 4}
    };

    public static final int[][] KILL_ENEMY_ANIMATION_SECOND = new int[][]{
            {4, 0, 4},
            {0, 4, 0},
            {4, 0, 4}
    };

    public static final int[][] KILL_ENEMY_ANIMATION_THIRD = new int[][]{
            {0, 0, 0},
            {0, 4, 0},
            {0, 0, 0}
    };

    public static final int[][] KILL_PLAYER_ANIMATION_FIRST = new int[][]{
            {4, 4, 4, 4, 4},
            {4, 4, 4, 4, 4},
            {4, 4, 4, 4, 4}
    };

    public static final int[][] KILL_PLAYER_ANIMATION_SECOND = new int[][]{
            {4, 0, 4, 0, 4},
            {0, 4, 0, 4, 0},
            {4, 0, 4, 0, 4}
    };

    public static final int[][] KILL_PLAYER_ANIMATION_THIRD = new int[][]{
            {0, 4, 0, 4, 0},
            {4, 0, 4, 0, 4},
            {0, 4, 0, 4, 0}
    };

    public static final int[][] KILL_BOSS_ANIMATION_FIRST = new int[][]{
            {4, 4, 4, 4, 4, 4, 4},
            {4, 4, 4, 4, 4, 4, 4},
            {4, 4, 4, 4, 4, 4, 4},
            {4, 4, 4, 4, 4, 4, 4},
            {4, 4, 4, 4, 4, 4, 4},
            {4, 4, 4, 4, 4, 4, 4}
    };

    public static final int[][] KILL_BOSS_ANIMATION_SECOND = new int[][]{
            {4, 0, 0, 4, 0, 0, 4},
            {0, 4, 0, 4, 0, 4, 0},
            {0, 0, 4, 4, 4, 0, 0},
            {0, 0, 4, 4, 4, 0, 0},
            {0, 4, 0, 4, 0, 4, 0},
            {4, 0, 0, 4, 0, 0, 4}
    };

    public static final int[][] KILL_BOSS_ANIMATION_THIRD = new int[][]{
            {0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0},
            {0, 0, 4, 4, 4, 0, 0},
            {0, 0, 4, 4, 4, 0, 0},
            {0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0}
    };

    public static final int[][] BOSS_ANIMATION_FIRST = new int[][]{
            {0, 0, 4, 0, 4, 0, 0},
            {0, 2, 2, 2, 2, 2, 0},
            {4, 2, 0, 2, 0, 2, 0},
            {4, 2, 2, 2, 2, 2, 4},
            {0, 0, 4, 4, 4, 0, 4},
            {0, 0, 4, 0, 4, 0, 0}
    };

    public static final int[][] BOSS_ANIMATION_SECOND = new int[][]{
            {0, 0, 4, 0, 4, 0, 0},
            {0, 2, 2, 2, 2, 2, 0},
            {0, 2, 0, 2, 0, 2, 4},
            {4, 2, 2, 2, 2, 2, 4},
            {4, 0, 4, 4, 4, 0, 0},
            {0, 0, 4, 0, 4, 0, 0}
    };
}