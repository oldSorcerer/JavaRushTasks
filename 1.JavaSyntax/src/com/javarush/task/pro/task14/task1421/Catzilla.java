package com.javarush.task.pro.task14.task1421;

import java.util.List;

public class Catzilla {
    private int fusionReactorCores = 5;
    private int fangStrength = 5;
    private final int[] clawsPerPaw = {5, 5, 4, 4};
    private List<Exception> exceptionRockets = List.of(new Exception("Take that!"), new Exception("Catzilla power!"), new Exception("You messed with the wrong cat!"),
            new Exception("You better not get up again!"), new Exception("Bang!"), new Exception("Kapaow!"),
            new Exception("Get some! Get some!"), new Exception("Whatcha gonna do now!?"));

    Catzilla() {
    }

    public void overclockReactor() throws InterruptedException {
        System.out.println("Overclocking reactor...");
        this.fusionReactorCores = 10;
        System.out.printf("Reactor has been overclocked. %d cores are ready.\n", this.fusionReactorCores);
    }

    public void enlargeFangs() throws InterruptedException {
        System.out.println("Initializing tungsten fangs...");
        fangStrength = 10;
        System.out.println("Fangs are ready with strength 10.");
    }

    public void generateExtraClaws() throws InterruptedException {
        System.out.println("Generating extra claws...");

        for (int i = 0; i < clawsPerPaw.length; i++) {
            clawsPerPaw[i] += 2;
            System.out.printf("Paw %d is ready with %d claws.\n", i + 1, clawsPerPaw[i]);
        }
    }

    public void fireExceptionRockets() throws InterruptedException {
        System.out.println("Firing exception rockets...");

        for (Exception exception : exceptionRockets) {
            Thread.sleep(100);
            exception.printStackTrace();
        }
        System.out.println("Rocket test completed.");
    }
}
