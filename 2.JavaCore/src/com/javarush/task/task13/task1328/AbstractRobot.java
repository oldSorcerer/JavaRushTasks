package com.javarush.task.task13.task1328;

import java.util.Random;

public abstract class AbstractRobot implements Attackable, Defensable {

    private static int hitCount = new Random().nextInt(4);

    public abstract String getName();

    public BodyPart attack() {
        BodyPart attackedBodyPart;
        hitCount = hitCount + 1;

        if (hitCount == 1) {
            attackedBodyPart = BodyPart.CHEST;
        } else if (hitCount == 2) {
            attackedBodyPart = BodyPart.ARM;
        } else if (hitCount == 3) {
            attackedBodyPart = BodyPart.HEAD;
        } else  {
            hitCount = 0;
            attackedBodyPart = BodyPart.LEG;
        }
        return attackedBodyPart;
    }

    public BodyPart defense() {
        BodyPart defendedBodyPart;
        hitCount = hitCount + 2;

        if (hitCount == 2) {
            defendedBodyPart = BodyPart.LEG;
        } else if (hitCount == 3) {
            defendedBodyPart = BodyPart.HEAD;
        } else if (hitCount == 4) {
            defendedBodyPart = BodyPart.ARM;
        } else {
            hitCount = 0;
            defendedBodyPart = BodyPart.CHEST;
        }
        return defendedBodyPart;
    }


}
